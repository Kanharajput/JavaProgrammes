/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Patteners 
{
    public static void main(String[] args) 
    {
        int i, j;
        for(i=1 ; i<5; i++)
        {
            for(j=1; j<5; j++)
            {
                if(i==1 || i==4 || j==1 ||j==4)
                    System.out.print("* ");
                
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
}
