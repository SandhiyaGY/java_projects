
package com.mycompany.skillrack;

import java.util.*;
public class  Home{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DataStore store=new DataStore();
        Utility obj=new Utility(store);
//      System.out.println("Admin side");
        
//      Festival section
//        System.out.println("Enter no of festivals");
        int F = Integer.parseInt(sc.nextLine().trim());
        for(int i=1;i<=F;i++){
//            System.out.println("Enter festive name"+i);
            String f=sc.nextLine().trim();
//            System.out.println("Enter startdate"+i);
            String st=sc.nextLine().trim();
//            System.out.println("Enter enddate"+i);
            String en=sc.nextLine().trim();
//            System.out.println("Enter discount"+i);
            double dis = Double.parseDouble(sc.nextLine().trim());
//            System.out.println("Enter Minimumpurchase"+i);
            double min = Double.parseDouble(sc.nextLine().trim());
            store.addFest(f,st,en,dis,min);
        }
//        System.out.println("Festivals saved.");
        System.out.println("Current festivals:");
        store.displayFest();
        
//      Products section
//        System.out.println("Enter No Of Products");
        int  P=Integer.parseInt(sc.nextLine().trim());
        for(int i=1;i<=P;i++){
//            System.out.println("Enter Product name"+i);
            String p=sc.nextLine().trim();
//            System.out.println("Enter Product id"+i);
            int id = Integer.parseInt(sc.nextLine().trim());
//            System.out.println("Enter Product price"+i);
            double rs = Double.parseDouble(sc.nextLine().trim());
            store.addProd(p,id,rs);
        }
//        System.out.println("Products saved.");
        
        
//        System.out.println("Customer side");
        
        System.out.println("Available Products:");
        store.displayProd();
//        System.out.println("Enter product name");
        String prod=sc.nextLine().trim();
//        System.out.println("Enter count");
        int c = Integer.parseInt(sc.nextLine().trim());
//        System.out.println("Enter purchase date");
        String date = sc.nextLine().trim();
        double total=obj.calculate(prod,c,date);
        System.out.println("Total :"+total);
    }
}
//3
//Tamil New Year
//10-apr-2025
//14-apr-2025
//12.5
//2000
//Independence Day
//10-aug-2025
//15-aug-2025
//8.0
//1200
//Diwali
//15-oct-2025
//20-oct-2025
//20.0
//2500
//3
//Silk Saree
//201
//3500
//Men T-Shirt
//202
//899
//Kids Frock
//203
//1200
//Kids Frock
//3
//16-oct-2025
