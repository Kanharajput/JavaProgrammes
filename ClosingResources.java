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
public class ClosingResources 
{
// for closing resources we have to use the finally block but not after the java 1.7 
public static void main(String[] args) throws Exception 
{
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
    {
        String str ;
        str = br.readLine();
        System.out.println("Kanha is " + str);
    }
}
}
