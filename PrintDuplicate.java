/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jaani
 */
public class PrintDuplicate
{
    public static void main(String[] args) 
    {
            ArrayList<String> names = new ArrayList<>();
            names.add("kanha");
            names.add("laddu");
            names.add("mohit");
            names.add("rudra");
            names.add("kanha");
            // Let's only print the duplicate values
            // we know that set is restrict the duplicate values so we use that property.
            
            Set<String> s = new HashSet<>();
            for(String name : names)
            {
                if(s.add(name) == false)
                    System.out.println(name);
            }
    }
}
