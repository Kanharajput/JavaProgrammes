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
public class FinallyBlockExcep 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            int i = 9;
            int j = 0;
            int k = i/j;
        }
        
        catch (Exception ae)
        {
              System.out.println("Exception is " + ae);
        }
        
        finally           // It will run any way if your try is getting wrong or right
        {
                try
                {
                    int a [] = new int[5];
                    for(int f =0; f<=5;f++)
                       a[f] = f;

                     System.out.println("Values are : ");

                     for(int value :a)
                           System.out.print(value);
                }
                 catch(Exception e)
                 {
                       System.out.println("Kake tanik dekh to sahi " + e );
                 }
        }
    }
}
