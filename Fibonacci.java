/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int temp =1;
        System.out.print("1  1  ");
        int i = 1;
        while(i<100)                                               //    This is my khud ka logic got it baby i love you
        {
            int j = i;
            i+=temp ;
            System.out.print(i+ "  ");
            temp = j; 
        }
    }
    
}
