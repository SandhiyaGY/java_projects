/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skillrack;

import java.util.*;
public class DataStore {
    private List<Festival> festivals= new ArrayList<>();
    private List<Product> products= new ArrayList<>();
    void addFest(String name,String st,String end,double discount,double minAmount) {
        festivals.add(new Festival(name,st,end,discount,minAmount));
    }
    void displayFest() {
        for(Festival f:festivals){
            System.out.println("Name: "+f.getFestName()+",Start: "+ f.getStart()+ ",End: " + f.getEnd()+ ",Discount: " + f.getDiscount()+ ",MinAmount: " + f.getMinAmount());
        }
    }
    void addProd(String name,int id,double amount) {
        products.add(new Product(name,id,amount));
    }
    void displayProd() {
        for(Product p:products){
            System.out.println("Name: "+p.getProdName()+",Amount: " + p.getAmount());
        }
    }
    public Product getProductByName(String name) {
        for(Product p:products) {
            if(p.getProdName().equals(name)) return p;
        }
        return null;
    }
    public List<Festival> getFestivals() {
        return new ArrayList<>(festivals);
    }
}
