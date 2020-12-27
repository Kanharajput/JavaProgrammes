/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Jaani
 */
public class IteratorDemo 
{
    public static void main(String[] args) 
    {
        Collection<Integer> value = new ArrayList<>(); 
        value.add(1);
        value.add(2);    
        value.add(3);
        value.add(4);
        
        Iterator it = value.iterator();
        System.out.println(value);
        while(it.hasNext())
            System.out.println("Values are " + it.next());        
    }
    
}
