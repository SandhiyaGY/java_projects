package com.projects.Festibill.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillingResponse {

    private String productName;

    private Integer quantity;

    private Double totalAmount;

    private Double discountPercentage;

    private Double finalAmount;
}
