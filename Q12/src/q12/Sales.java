/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class Sales {
    public static void main(String[] args) {
        
        ArrayList<SalesPerson> people = new ArrayList<>();
        //SalesPerson obj = new SalesPerson("Pasindu", 3);
        people.add(new SalesPerson("Pasindu", 1));
        people.add(new SalesPerson("Nimal", 2));
        people.add(new SalesPerson("Kamal", 3));
        people.add(new SalesPerson("Sunil", 4));
        people.add(new SalesPerson("Jehan", 5));
        people.sort(SalesPerson.SPLapCount);
        int totalCount = 0;
        float totalSales = 0;
        for(SalesPerson sp : people){
            System.out.println(sp.name + ": " + sp.calculateSales()+" Commisson: "+sp.calculateCommission());
            totalSales += sp.calculateSales();
        }
        
        System.out.println("Avarage: " + (totalSales/people.size()));
        
        
}
}
