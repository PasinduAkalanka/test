/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Scanner;

/**
 *
 * @author pasindu akalanka
 */
public class Calculater {
private int number1;
private int number2;
private int total;
 
 public int sum(){
     Scanner input = new Scanner(System.in);  
     System.out.println("Enter first number");
     number1=input.nextInt();
     System.out.println("Enter second number");
     number2=input.nextInt();
      total=number1+number2;
        return total;
    }
    public static void main(String[] args) {
     Calculater Obj=new Calculater();      
     System.out.println("Total is :-"+Obj.sum());
    }
    
}
