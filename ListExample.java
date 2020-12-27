/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jaani
 */
public class ListExample
{
        public static void main(String[] args) 
        {
                // this is list in which anytype of data can be store.
                List values = new ArrayList();   //  List support index no. while Collection can't 
                values.add(10);
                values.add(100);                // No generics only list.
                values.add(50);
                values.add(40);
                values.add(30);
                // we can use loops
                System.out.println("values are  " + values.get(0)+ values.get(1));
                // but if we want to work with speciric data then what to do next . lets  come to generics 
                // here is index no. so we can use enhanced loop to get out the values 
                
                for(Object o : values)    // Also use Iterator but that is in Collections
                    System.out.println("Values" + o);  //  That 10 and kanha is object of Integer class and String class ?
                
                //  int a = 10 ;
               //   Integer a = new Integer(10);    
             // Lets sort the list
               Collections.sort(values);
               values.forEach(System.out::println);   // another way to get out element 
        }
        
}
