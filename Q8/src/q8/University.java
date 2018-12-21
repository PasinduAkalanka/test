/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class University {
 private String grade;
 
 public void cal_grade(int grd){
    
     if(grd >=0 && grd <=50){
         this.grade="Fail";
     }
     else if(grd <=60){
         this.grade="Pass";
     }
     else if (grd <= 70){
         this.grade="Merit";
     }
     else{
         this.grade="Distinction";
     }
 }
    public String get_grade(){
        return grade;
    }
   
    public static void main(String[] args) {
        String box1=JOptionPane.showInputDialog(null,"Enter Subject Marks");  
        int number1 = Integer.parseInt(box1);
        University Obj=new University();
        Obj.cal_grade(number1);
        JOptionPane.showMessageDialog(null,"Your Grade is:-"+Obj.get_grade());
    }
    
}
