/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.Vector;

/**
 *
 * @author Jaani
 */
public class VectorEx
{
    public static void main(String[] args) 
    {
        // Always use ArrayList not Vector . Vector is an old class which supports synchronization theoretically not practically . that make it slow to work.
       // ArrayList is increased capacity by 50%
        // It can told as dynamic Array.
        Vector v = new Vector();  // it implements List
        v.add(9);
        v.add(19);
        System.out.println("Capacity is increased by 100% " + v.capacity());
        // If element less than 10 capacity is 10 
        // if element is 11 than it is 20
        // if  element is 21 thatn it is 40.
        
    }
}
