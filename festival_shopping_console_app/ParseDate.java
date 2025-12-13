/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skillrack;

/**
 *
 * @author saraswathy
 */
import java.util.*;

public class ParseDate {
    public static Date parseDate(String s) {
        String[] a=s.split("-");
        int day=Integer.parseInt(a[0]);
        String m=a[1].toLowerCase();
        int year=Integer.parseInt(a[2]);
        Map<String, Integer> map = new HashMap<>();
        map.put("jan",0);
        map.put("feb",1);
        map.put("mar",2);
        map.put("apr",3);
        map.put("may",4);
        map.put("jun",5);
        map.put("jul",6);
        map.put("aug",7);
        map.put("sep",8);
        map.put("oct",9);
        map.put("nov",10);
        map.put("dec",11);
        Calendar cal = Calendar.getInstance();
        cal.set(year,map.get(m),day);
        return cal.getTime();
    }
}
