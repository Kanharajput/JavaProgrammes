/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.Scanner;

/**
 *
 * @author Jaani
 */
public class ThrowException 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int j = input.nextInt();
        int i = 10 ;
        int k = i+j;
   
        try
        {
            if (k<20)
            throw new ArithmeticException();        //Nothing here we only want the catch
        }
        
        catch(ArithmeticException ae)
         {
                System.out.println("NO is less than 20");
          }
    }
}
