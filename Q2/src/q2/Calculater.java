/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author pasindu akalanka
 */
public class Calculater {
    private int number1=5;
    private int number2=5;
    private int total;
    
    public int sum(){
        total=number1+number2;
        return total;
    }
    public static void main(String[] args) {
     Calculater Obj=new Calculater();      
     Obj.sum();
     System.out.println("Total is :-"+Obj.sum());
    }
    
}
