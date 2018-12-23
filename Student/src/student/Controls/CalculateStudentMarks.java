/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.Controls;

import java.util.ArrayList;

/**
 *
 * @author pasindu akalanka
 */
public class CalculateStudentMarks {
    
    
   public int StudentResult(ArrayList<Integer> studentMarkList){
       int result = 0;
       for (int i = 0; i < studentMarkList.size(); i++) {
          result = result +studentMarkList.get(i);
       }
  return result;
   }
    
}
