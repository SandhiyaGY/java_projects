package com.projects.Festibill.config;


import com.projects.Festibill.entity.Product;
import com.projects.Festibill.entity.Festival;
import com.projects.Festibill.repository.ProductRepository;
import com.projects.Festibill.repository.FestivalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final FestivalRepository festivalRepository;

    @Override
    public void run(String... args) {
        System.out.println("DataLoader Started");
        System.out.println("Products = " + productRepository.count());
        System.out.println("Festivals = " + festivalRepository.count());
        if(productRepository.count() <10000){

            List<Product> products = new ArrayList<>();

            for(int i = 1; i <= 10000; i++){
                products.add(
                        Product.builder()
                                .name("Product_" + i)
                                .price(Math.random() * 10000)
                                .build()
                );
            }

            productRepository.saveAll(products);
        }

        if(festivalRepository.count() <10000){

            List<Festival> festivals = new ArrayList<>();

            for(int i = 1; i <= 10000; i++){

                festivals.add(
                        Festival.builder()
                                .name("Festival_" + i)
                                .startDate(LocalDate.now().minusDays((long)(Math.random()*100)))
                                .endDate(LocalDate.now().plusDays((long)(Math.random()*100)))
                                .discountPercentage(5 + Math.random() * 45)
                                .minimumAmount(1000 + Math.random() * 50000)
                                .build()
                );
            }

            festivalRepository.saveAll(festivals);
        }

        System.out.println("Sample data loaded successfully.");
    }
}