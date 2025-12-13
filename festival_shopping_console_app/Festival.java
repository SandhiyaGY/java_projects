/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skillrack;

/**
 *
 * @author saraswathy
 */
public class Festival {
    private String festName;
    private String stDate;
    private String endDate;
    private double discount;
    private double minAmount;

    Festival(String name, String st, String end, double discount, double minAmount) {
        this.festName = name;
        this.stDate = st;
        this.endDate = end;
        this.discount = discount;
        this.minAmount = minAmount;
    }

    String getFestName() { return festName; }
    String getStart() { return stDate; }
    String getEnd() { return endDate; }
    double getDiscount() { return discount; }
    double getMinAmount() { return minAmount; }
 
}
