/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class OddEvenPattern 
{
    public static void main(String[] args) 
    {
    for(int i=0; i<5;i++) 
    {
    for(int j=0; j<=i; j++)
    { int k = j+i; 
        if(k % 2==0)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
    }
    System.out.println("");
    }
    }
    
}
