package com.mycompany.skillrack;

import java.util.Date;
import java.util.List;
public class Utility {
    private final DataStore store;
    public Utility(DataStore store){
        this.store=store;
    }
    public double calculate(String p,int c,String date) {
        Product prod=store.getProductByName(p);
        if(prod==null) return -1;
        double total=prod.getAmount()*c;
        Date d=ParseDate.parseDate(date);
        if(d==null){ return total; }
        List<Festival> fests=store.getFestivals();
        double dis=0.0;
        for(Festival f:fests){
            Date st=ParseDate.parseDate(f.getStart());
            Date en=ParseDate.parseDate(f.getEnd());
            boolean inRange=!d.before(st) && !d.after(en);
            if (inRange&&total>=f.getMinAmount()){
                if(f.getDiscount()>dis) dis= f.getDiscount();
            }
        }
        double finalTotal=total;
        if(dis>0){
            finalTotal=total*(1.0-dis/100.0);
        }
        return finalTotal;
    }
}
