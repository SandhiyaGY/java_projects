package com.projects.Festibill.service;


import com.projects.Festibill.dto.BillingRequest;
import com.projects.Festibill.dto.BillingResponse;
import com.projects.Festibill.entity.Bill;
import com.projects.Festibill.entity.Festival;
import com.projects.Festibill.entity.Product;
import com.projects.Festibill.repository.BillRepository;
import com.projects.Festibill.repository.FestivalRepository;
import com.projects.Festibill.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillingService {

    private final ProductRepository productRepository;
    private final FestivalRepository festivalRepository;
    private final BillRepository billRepository;

    public BillingResponse generateBill(
            BillingRequest request) {

        Product product =
                productRepository.findByName(
                                request.getProductName())
                        .orElseThrow();

        double total =
                product.getPrice() *
                        request.getQuantity();

        double maxDiscount = 0;

        List<Festival> festivals =
                festivalRepository.findAll();

        for(Festival festival : festivals){

            boolean inRange =
                    !request.getPurchaseDate()
                            .isBefore(festival.getStartDate())
                            &&
                            !request.getPurchaseDate()
                                    .isAfter(festival.getEndDate());

            if(inRange &&
                    total >= festival.getMinimumAmount()) {

                maxDiscount =
                        Math.max(
                                maxDiscount,
                                festival.getDiscountPercentage());
            }
        }

        double finalAmount =
                total -
                        (total * maxDiscount / 100);

        Bill bill = Bill.builder()
                .billDate(request.getPurchaseDate())
                .totalAmount(total)
                .discountApplied(maxDiscount)
                .finalAmount(finalAmount)
                .build();

        billRepository.save(bill);

        return BillingResponse.builder()
                .productName(product.getName())
                .quantity(request.getQuantity())
                .totalAmount(total)
                .discountPercentage(maxDiscount)
                .finalAmount(finalAmount)
                .build();
    }
}