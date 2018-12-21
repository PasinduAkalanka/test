/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_q5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class SalaryCalulation {

    /**
     * @param args the command line arguments
     */
    private int[] salaryList = new int[10];
    private int totalSales;
    private int i;
    public int getPeoplesSalary(){
        for(i=0;i<9;i++){
        int index=i+1;
        String box1=JOptionPane.showInputDialog(null,"Enter the "+index+" salespeople salary :");  
        int grossSales = Integer.parseInt(box1);
        this.totalSales = (grossSales*9/100)+ 200;
        this.salaryList[i] = totalSales;
        //System.out.println(salaryList[i]);
      }  
        return totalSales;
    }
    public void salaryRange(){
        //List<Integer> al = new ArrayList<>();
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;        
        for(int j=0;j<salaryList.length;j++){
        if(salaryList[j]>=200 && salaryList[j]<=299){
          // al.add(j);
           count++;
          }
        else if(salaryList[j]>=300 && salaryList[j]<=399){
           count1++;
          }
        else if(salaryList[j]>=400 && salaryList[j]<=499){
           count2++;
          }
        else if(salaryList[j]>=500 && salaryList[j]<=599){
           count3++;
          }
        else if(salaryList[j]>=600 && salaryList[j]<=699){
           count4++;
          }
        else if(salaryList[j]>=700 && salaryList[j]<=799){
           count5++;
          }
        else if(salaryList[j]>=800 && salaryList[j]<=899){
           count6++;
          }
        else if(salaryList[j]>=900 && salaryList[j]<=999){
           count7++;
          }
        else if(salaryList[j]>=1000) {
           count8++;
          }
       
        }
        System.out.println("Salespeople salary range $200 to $299 : "+count);
        System.out.println("Salespeople salary range $300 to $399 : "+count1);
        System.out.println("Salespeople salary range $400 to $499 : "+count2);
        System.out.println("Salespeople salary range $500 to $599 : "+count3);
        System.out.println("Salespeople salary range $600 to $699 : "+count4);
        System.out.println("Salespeople salary range $700 to $799 : "+count5);
        System.out.println("Salespeople salary range $800 to $899 : "+count6);
        System.out.println("Salespeople salary range $900 to $999 : "+count7);
        System.out.println("Salespeople salary range over 1000 : "+count8);
    }
    public static void main(String[] args) {
        SalaryCalulation Obj = new SalaryCalulation();
        Obj.getPeoplesSalary();
        Obj.salaryRange();
    }
    
}
