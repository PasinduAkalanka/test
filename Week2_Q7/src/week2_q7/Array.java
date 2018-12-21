/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_q7;

import java.util.HashSet;

/**
 *
 * @author pasindu akalanka
 */
public class Array {

    private int [] array1 = new int [10];
    public void getSortedlist(){
        this.array1 = new int []{1,2,2,3,3,4,4,4,5,6};
        System.out.println("Duplications");
        int totalCount = 1;
        for (int i = 0; i< array1.length -1; i++ ) {
            if((array1[i]) == (array1[i+1])){
                totalCount += 1;
            }else{
                System.out.print(array1[i] + " : ");
                System.out.println(String.valueOf(totalCount));
                totalCount = 1;
            }
        }
        if((array1[array1.length-2]) != (array1[array1.length-1])){
            System.out.print(array1[array1.length-1] + " : ");
            System.out.println(String.valueOf(totalCount));
           
    }
        else{
            System.out.print(array1[array1.length-1] + " : ");
            System.out.println(totalCount);
        }
        
    }
   
    public static void main(String[] args) {
        Array Obj = new Array();
        Obj.getSortedlist();
}
}
