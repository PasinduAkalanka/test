/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_q09;

import javax.swing.JOptionPane;

/**
 *
 * @author pasindu akalanka
 */
public class Domains {
    private final String [][] mulltyArray = {{"google.com","128.23.5.1"},{"yahoo.com","12.4.54.23"},{"amazon.com","220.45.2.44"},{"office365","198.2.168.3"},{"azure","178.235.2.125"}};
    
    public void userInput(){
         String box1=JOptionPane.showInputDialog("Enter the domain name?");  
        for (String[] mulltyArray1 : mulltyArray) {
            if (box1 == null ? mulltyArray1[0] == null : box1.equals(mulltyArray1[0])) {
                
                JOptionPane.showMessageDialog(null,mulltyArray1[0]+" - "+mulltyArray1[1]);
            }
        }
    }
    public static void main(String[] args) {
         Domains Obj = new Domains();
         Obj.userInput();
    }
    
}
