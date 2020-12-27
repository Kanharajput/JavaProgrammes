/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Ascii 
{
    public static void main(String[] args) 
    {
    for(int i =0; i<=127; i++)    
    {
        System.out.println((char)i + " " +i);
    }
    // another way 
    for(int i=0; i<=127; i++)
    {
        System.out.printf("%d : %c \n " , i,i );
    }
    }
    
}
