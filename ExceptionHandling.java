/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

/**
 *
 * @author Jaani
 */
public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
      int i = 9;
      int k = 0;
      
      try 
      {
          int j = i/k;
      }
      
       catch(ArithmeticException e)
      {
              System.out.println("Error is that you can't  divide any number by zero " + e);
      }
      
    }
}
