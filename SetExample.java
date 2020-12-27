/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jaani
 */
public class SetExample                                                                               
{
    public static void main(String[] args) 
    {
        Set<Integer> set = new HashSet<>();
        // here this add method return boolean value so we can use it. 
        // Set not take the duplicate value , this is an advantage . here the values named as element.
        System.out.println(set.add(90));
        System.out.println(set.add(89));
        System.out.println(set.add(55));
        System.out.println(set.add(7));
        System.out.println(set.add(55));
        // duplicate element return false.
        
        for(int s : set)
            System.out.println(s);
        
        // here nothing gone change with element but the sequence is changed.
        // so to get the element in ascending order we can use TreeSet class which also implements Set.
        
        Set<Integer>set1 = new TreeSet<>();
        System.out.println("After using TreeSet");
         System.out.println(set1.add(910));
        System.out.println(set1.add(893));
        System.out.println(set1.add(557));
        System.out.println(set1.add(745));
        System.out.println(set1.add(910));
        
        for(int s : set1)
            System.out.println(s);
        
    }
}
