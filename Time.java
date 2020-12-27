/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;

/**
 *
 * @author Jaani
 */
public class Time 
{
    public static void main(String[] args) 
    {
            long start = System.currentTimeMillis();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 1; i<=100000; i++)
                    a.add(i);
            
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            
            System.out.println(start);   // if we directly print the time then it will return the no of milliseconds from 1st jan 1970 to current time.     
    }
}
