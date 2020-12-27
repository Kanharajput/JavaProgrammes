/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaani
 */
// we can use make a class with this concept, 
//  Pros of Generics.
class Container<T>      // here this T is used to make the variable to a particular and we can easily change that type at time of instantiating. 
{
    T value;                            // value can any type which is passed to T
    public T show()
    {
            return value;
     }
}

// lets make an another class to show something more with generics

class Daba<T extends Number>   // if we want that numbers will only assign to that value variable than we have to extends Number class which is superior of all.  
{                                                         
    T value;   
    public void demo(ArrayList<? extends T> obj) //  ? means any class which extends the Number class can pass here we can  write T at place of Number 
                                                                                                // because it extends Number . 
    {  
    }
    
    public void demo1(ArrayList<? super T> obj)
    {
        // same as demo but here let suppose T is Integer and ? is Number than it work because Number is super class of Integer but if there is a 
        // subclass of Integer than it can't work here
    }
    
}



public class GenericsExample
{
    public static void main(String[] args)
    {
        List<Integer> intvalues = new ArrayList<>();
        // intvalues.add("kanha"); we can't do this because we specify our list to only support Integer values.
        intvalues.add(20);
        System.out.println("values are " + intvalues.get(0));
        
        // Now lets make an object of Container class.
        Container<Double> obj = new Container<>();  
        obj.value = 10.1;
        System.out.println(obj.show());
        
        // For second class Daba 
        Daba<Integer> obj1 = new Daba<>();
        //Daba<String> obj1 = new Daba<>();  can't do this because we have extended the Number class which make boundation for other classes.
        obj1.demo(new ArrayList<Integer>());  // we can pass any class which extends Number class
        
        obj1.demo1(new ArrayList<Number>());  // Number is a super class of double.
    
    }
}
