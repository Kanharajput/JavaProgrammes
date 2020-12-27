/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jaani
 */
public class ThrowsException 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();                 // If we don't throws the exception it will not run but we can only throw the checked exception 
        System.out.println("Now i really got this BufferedReader with the help of exception " + str);
    }
    
}
