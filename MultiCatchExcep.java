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
public class MultiCatchExcep
{
    public static void main(String[] args) 
    {
      // Let suppose there are many exception and some of them you know but for no knowing exception we use the super class named Exception 
     // but we to write it in the last of the all exception because if it was first then it will catch all the exception so what is the benefit of knowing exception .....
   
        try
        {
        int i = 9;
        int j = 0;
        int k = i/j;
        
        int a [] = new int[5];
        
        for(int f =0; f<=5;f++)
                a[f] = f;
        
        System.out.println("Values are : ");
        
        for(int value :a)
                System.out.print(value);
        }
        
        catch(ArithmeticException ae)
        {
            System.out.println("Weak in maths" + ae);
        }
        
        catch(Exception e)
        {
            System.out.println("Something gonna wrong " + e);
        }
        
    }
}
