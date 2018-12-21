/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class Other {
    public static void main(String[] args) {
int totalsales=0;
        int perSalesCount=0;
        int totSalesCount=0;
        for(int i=1;i<=5;i++){
        String box1=JOptionPane.showInputDialog(null,"Enter "+i+" sales person ");
        perSalesCount = Integer.parseInt(box1);
        totalsales=850000*perSalesCount;
        System.out.println("Total sales for "+i+" sales person "+totalsales);
        totSalesCount=totSalesCount+totalsales;
        if(perSalesCount>=10){
            int tenCommission=(totalsales*10)/100;
            System.out.println("Sales Commission ="+tenCommission);
         }
        else if (perSalesCount>=5){
            int tenCommission=(totalsales*5)/100;
            System.out.println("Sales Commission ="+tenCommission);
        }
        else{
            int tenCommission=(totalsales*2)/100;
            System.out.println("Sales Commission ="+tenCommission);
        }
        }
        
        int avg=totSalesCount/5;
        System.out.println("Average laptop sales = "+avg);
    
}
}
