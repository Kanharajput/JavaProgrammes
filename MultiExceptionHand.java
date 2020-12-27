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
public class MultiExceptionHand 
{
    public static void main(String[] args) 
    {
        int k =10;
        int j= 0;
      int a[] = new int[5];
      
       try
      {
          int r = k/j;
      }
       
       catch(ArithmeticException ae)    //  This is multiException handling 
      {
          System.out.println("Don't do this man ");
      }
      
      try
      {
          for(int i = 0; i<=5;i++)
                a[i]=i;
      }
      
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("Element Out of bound hai mere bhai");
      }
      
      for(int value : a )
            System.out.println("Inside i is " + value);
    }
}
   