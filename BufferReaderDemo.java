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
public class BufferReaderDemo 
{
    public static void main(String[] args) throws Exception
    { 
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader obj = new BufferedReader(is);
        System.out.println("Enter your name ");
        String str = obj.readLine();
        System.out.println("Enter your age  ");
        int i = Integer.parseInt(obj.readLine());  // to make to take integer data BufferedReader is take String data.
        System.out.println("Name is " + str);
        System.out.println("Age is " + i);
    }
}
