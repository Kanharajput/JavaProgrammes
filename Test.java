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
public class Test                                                           // This is the test class to work with the different class 
{
    private void show(int i )
    {
    Scanner input = new Scanner(System.in);
    System.out.println("  what's your name ");
    String kanha = input.next(); 
    System.out.println("Your name is " + kanha);
        System.out.println("That is " + i);    
    }
     
}

