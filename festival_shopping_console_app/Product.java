/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skillrack;

/**
 *
 * @author saraswathy
 */
public class Product{
    private String prodName;
    private int id;
    private double amount;

    Product(String name,int id,double amount){
        this.prodName=name;
        this.id=id;
        this.amount=amount;
    }

    String getProdName() { return prodName; }
    double getAmount() { return amount; }   
}
