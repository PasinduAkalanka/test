/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class University {
private int marks;
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
        int result=0;
        for(int i=0;i<=9;i++){
        String box1=JOptionPane.showInputDialog(null,"Enter Subject Marks");  
       // int number1 = Integer.parseInt(box1);
        try{
        int number1 = Integer.parseInt(box1);
        result=result+number1;
       }catch (NumberFormatException ex) {
       JOptionPane.showMessageDialog(null,"Wrong input");
}
        }
        int avg=result/10;
        University Obj=new University();
       Obj.cal_grade(avg);
       JOptionPane.showMessageDialog(null,"Your Grade is:-"+Obj.get_grade());
    }    
}
