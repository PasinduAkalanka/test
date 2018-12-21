/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_q11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pasindu Nisal
 */
public class Domains {
    //  private final String [][] mulltyArray = {{"google.com","128.23.5.1"},{"yahoo.com","12.4.54.23"},{"amazon.com","220.45.2.44"},{"office365","198.2.168.3"},{"azure","178.235.2.125"}};
   // ArrayList<String>[][] list = new ArrayList[10][10];
    
    public void userInput(){
        ArrayList<String>[][] mulltyArray = new ArrayList[10][2];
        mulltyArray[0][0] = new ArrayList();
        mulltyArray[0][0].add("google.com");
        mulltyArray[0][1] = new ArrayList();
        mulltyArray[0][1].add("128.23.5.1");
        mulltyArray[1][0] = new ArrayList();
        mulltyArray[1][0].add("yahoo.com");
        mulltyArray[1][1] = new ArrayList();
        mulltyArray[1][1].add("12.4.54.23");
        mulltyArray[2][0] = new ArrayList();
        mulltyArray[2][0].add("amazon.com");
        mulltyArray[2][1] = new ArrayList();
        mulltyArray[2][1].add("220.45.2.44");
        mulltyArray[3][0] = new ArrayList();
        mulltyArray[3][0].add("office365");
        mulltyArray[3][1] = new ArrayList();
        mulltyArray[3][1].add("198.2.168.3");
        mulltyArray[4][0] = new ArrayList();
        mulltyArray[4][0].add("azure");
        mulltyArray[4][1] = new ArrayList();
        mulltyArray[4][1].add("178.235.2.125");
        for(int a=0;a<5;a++){
         String box1=JOptionPane.showInputDialog("Enter the domain name?");  
         ArrayList<String>[] mulltyArray1 = new ArrayList [1];
         mulltyArray1[0] = new ArrayList();
         mulltyArray1[0].add(box1);
         
         int count = 4;
            for(int i=0;i<5;i++){
                count++;
         //System.out.println("first"+i);
         String input= mulltyArray[i][0].toString();
         String setValue= mulltyArray1 [0].toString();
        //System.out.println(count);
         if(input.equals(setValue)){
                    for(int j = 0; j <1; j++){
                       System.out.println(i);
                       System.out.println(j);
                            
                       mulltyArray[i][j] = new ArrayList();
                       mulltyArray[i][j].add(input);
                    }
                    for(int j = 0; j <1; j++){
                    mulltyArray[i][j] = new ArrayList();
                       mulltyArray[i][j].add("0.0.0.0");
                    }
                       System.out.println(Arrays.toString(mulltyArray[i]));
         }
         else {
             //System.out.println(count);
             for(int l = 5; l <=count; l++){
                   for(int j = 0; j <1; j++){
                       System.out.println(l);
                       System.out.println(j);
                    mulltyArray[l][j] = new ArrayList();
                    mulltyArray[l][j].add("localhost");
                   }
                   for(int j = 1; j <=1; j++){
                    mulltyArray[l][j] = new ArrayList();
                    mulltyArray[l][j].add("127.0.0.1");
                       System.out.println(Arrays.toString(mulltyArray[5]));      
                  }
                }
              }
            }
          }     
        }

    public static void main(String[] args) {
         Domains Obj = new Domains();
         Obj.userInput();
        
    }
}
