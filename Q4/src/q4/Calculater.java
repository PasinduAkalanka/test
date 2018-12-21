/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class Calculater {
private int number1;
private int number2;
private int total;
 
 public int sum(){
     String box1=JOptionPane.showInputDialog(null,"Enter first number");  
     number1 = Integer.parseInt(box1);
     String box2=JOptionPane.showInputDialog(null,"Enter second number");
     number2=Integer.parseInt(box2);
      total=number1+number2;
        return total;
    }
    public static void main(String[] args) {
     Calculater Obj=new Calculater();     
     JOptionPane.showMessageDialog(null,"Total is:- "+Obj.sum());
    }
}
