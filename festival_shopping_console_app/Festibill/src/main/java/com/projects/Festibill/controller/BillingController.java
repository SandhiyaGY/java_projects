package com.projects.Festibill.controller;

import com.projects.Festibill.dto.BillingRequest;
import com.projects.Festibill.dto.BillingResponse;
import com.projects.Festibill.service.BillingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/billing")
@RequiredArgsConstructor
public class BillingController {

    private final BillingService billingService;

    @PostMapping("/generate")
    public BillingResponse generateBill(
            @RequestBody BillingRequest request){

        return billingService.generateBill(request);
    }
}