/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10;

/**
 *
 * @author pasindu akalanka
 */
public class RandomDice {
    public int roll(){
      int random = (int )(Math.random() * 6 + 1);
      System.out.println(random);
      return random;
    }

    public static void main(String[] args) {
      String result;
      RandomDice Obj1=new RandomDice();
      int n1 = Obj1.roll();
      RandomDice Obj2=new RandomDice();
      int n2 = Obj2.roll();
      int sum=n1+n2;
      System.out.println(sum);
      if(sum ==7 || sum ==11){
        result= "You Win";
      }
      else if(sum ==2 || sum ==3 || sum ==12){
        result="You Lose";
      }
      else{
          result="point to win";
      }
      
      if("point to win".equals(result)){
        boolean inGame=true;
        int total;
        while(inGame){
            total= Obj1.roll()+ Obj2.roll();
            System.out.println(total);
            //System.out.println(inGame);
          if(sum==total)  {
              System.out.println("You Win");
              inGame=false;
          } else if (sum == 7){
              System.out.println("You Lose");
              inGame=false;
            }
          
        } 
      }
      
      
      //System.out.println(result);
    }
    
}
