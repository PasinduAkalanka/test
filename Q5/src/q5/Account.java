/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;


public class Account {
String acc_name;
float balance =150;

public void acc_balance(String saving_acc_name,float dep_amount){
   balance=balance+dep_amount;
}
    
    public static void main(String[] args) {
       Account Obj=new Account();
       Obj.acc_balance("savings_acc", 34.50f);
    }
    
}
