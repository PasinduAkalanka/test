/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_q6;

import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class OddNumbers {

    /**
     * @param args the command line arguments
     */
    private int[] Array1 = new int[10];
    private int i;
    public void userInput(){
        for(i=0;i<10;i++){
        int index=i+1;
        String box1=JOptionPane.showInputDialog(null,"Enter the "+index+" number");  
        int input = Integer.parseInt(box1);
        this.Array1[i] = input;
     }
    }
    public void getOddNumber(){
        for(i=0;i<Array1.length;i++){
        //System.out.println(Array1[i]);
        if (Array1[i] % 2 == 1){
            System.out.println("Odd Number : "+Array1[i]);
        }
       }
    }
    public static void main(String[] args) {
        OddNumbers Obj = new OddNumbers();
        Obj.userInput();
        Obj.getOddNumber();
    }
    
}
