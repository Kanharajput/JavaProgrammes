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
public class StringOperation 
{
    public static void main(String[] args) 
    {
      String s2,s1;
      Scanner input = new Scanner(System.in);
        System.out.println("Enter first string ");
        s1 = input.nextLine();
        
        System.out.println("Enter Second string ");
        s2 = input.nextLine();
        
        String s3 = s1.concat(s2);   // s1 + s2 work same as it
        System.out.println("Concate of s1 and s2 is "  + s3);
        
        s1 =s1.toUpperCase();
        System.out.println("Uppercase of s1 is " + s1);
        
        int l1 = s1.length();
        int l2 = s1.length();
        System.out.println("Length of S1 is" + l1);
        System.out.println("Length of S2 is" + l2);        
    }    
}
