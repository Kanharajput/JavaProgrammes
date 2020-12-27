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
public class ReadInput 
{
    public static void main(String[] args)  throws Exception
    {
        // new way to get input is here taliya maro sab
    
        System.out.println("Write something : ");
        int i = System.in.read();
        System.out.println("Value is " + i); // it will give ascii value let's change it
        System.out.println("Right value is " + (char)i);  
    }
}
