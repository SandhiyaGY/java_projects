package com.projects.Festibill.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class BillingRequest {

    private String productName;

    private Integer quantity;

    private LocalDate purchaseDate;
}