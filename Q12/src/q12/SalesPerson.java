/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12;

import java.util.Comparator;

/**
 *
 * @author pasindu akalanka
 */
public class SalesPerson {
    public String name;
    private int laptopCount;
    private float sales;
    public final static float laptopPrize = 85000f;
    private float commission; 
    
    public static Comparator<SalesPerson> SPLapCount = new Comparator<SalesPerson>() {

	public int compare(SalesPerson sp1, SalesPerson sp2) {

	   int sp1count = sp1.getLaptopcount();
	   int sp2count = sp2.getLaptopcount();

	   /*For ascending order*/
	   return sp1count-sp2count;

	   /*For descending order*/
	   //rollno2-rollno1;
   }};
    
    SalesPerson(String name, int count){
        this.name = name;
        this.laptopCount = count;
    }

   
    public int getLaptopcount() {
        return laptopCount;
    }

    /**
     * @param laptopcount the laptopcount to set
     */
    public void setLaptopcount(int laptopcount) {
        this.laptopCount = laptopcount;
    }
    
    public float calculateSales(){
        this.sales = this.laptopCount * SalesPerson.laptopPrize;
        return this.sales;
    }
    
    public float calculateCommission(){
        if(this.laptopCount>=10){
            this.commission = this.calculateSales() * 0.1f;
        }
        if(this.laptopCount>=5){
            this.commission = this.calculateSales() * 0.05f;
        }
        else{
            this.commission = this.calculateSales() * 0.02f;
        }
        return this.commission;
    }
    
}
