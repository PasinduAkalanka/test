/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2_Q8ok;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pasindu Nisal
 */
public class Airline {
    private int [] inputArray = new int [10];
    //private String [] economyClass = new String [5];
    ArrayList<List> economyclass = new ArrayList<List>(5);
    ArrayList<List> firstclass = new ArrayList<List>(5);
    ArrayList<List> details = new ArrayList<List>(10);
    
    public void getclasstype(){
        for(int i=0;i<=9;i++){
        System.out.println("Enter number 1 for First Class or Number 2 for Economy Class :");
        Scanner input = new Scanner(System.in);
        inputArray [i] = input.nextInt();
        if(inputArray[i]==1){
            
            if(firstclass.size()>=5){
                System.out.println("Curruntly First Class section is full");
            }
            else{
                int no=i+1;
                String seatno ="S.First000"+no;
                String bpassnumber = "Boarding Pass no Bp000"+no;
                List<String> temp = new ArrayList<>(2);
                temp.add(0,seatno);
                temp.add(1,bpassnumber);
                firstclass.add(temp);
                
            }
            }
            else if(inputArray[i]==2){
                
                   if(economyclass.size()<5){
                    int no=i+6;
                    String seatno ="S.Eco000"+no;
                    String bpassnumber = "Boarding Pass no Bp000"+no;
                    List<String> temp = new ArrayList<>(2);
                    temp.add(0,seatno);
                    temp.add(1,bpassnumber);
                    economyclass.add(temp);
                    
                }
            else{
                    System.out.println("Economy class section is full,You can book first class? (Yes/No)");
                    Scanner input2 = new Scanner(System.in);
                    String yesorno = input2.nextLine();
                    if ("yes".equals(yesorno)){
                         int no=i+6;
                            String seatno ="S.Ecoco000"+no;
                            String bpassnumber = "Boarding Pass no Bp000"+no;
                            List<String> temp = new ArrayList<>(2);
                            temp.add(0,seatno);
                            temp.add(1,bpassnumber);
                            economyclass.add(temp);
                           
                    }
                    else{
                        this.getclasstype();
                    }
                }
            }
        details.add(firstclass);
        details.add(economyclass);
        }
    }
    public void arrayRead(){
        for (List detail : details) {
            System.out.print(detail);
        }
    }
  
    public static void main(String[] args) {
        Airline Obj = new Airline();
        Obj.getclasstype();
        Obj.arrayRead();
    }
    
}
