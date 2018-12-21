/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6andQ7;

/**
 *
 * @author pasindu akalanka
 */
public class Account {
    String acc_name;
    float balance =150;

public void acc_balance(String saving_acc_name,float dep_amount){
    if(dep_amount >= 0){
        balance=balance+dep_amount;
    }
    else{
        System.out.println("Cant enter naegative value for Deposit Amount");
    }
   
}
}
