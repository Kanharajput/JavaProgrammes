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
// here we are going to show how static keyword is applicalble to class 
// where we use static keyword it simply mean that there is no mean to make an object to call that member function or variable  // or don't need to initiate the class 
// making object
// we can simply call it by that class 
// CheckStatic.show()
// we can't use the non static variable inside a static member function only static are applicable
// Done for static have good day 

public class StaticKeyword 
{
    public static void main(String[] args) 
    {
        CheckStatic.i = 5;
        CheckStatic.show();
        CheckStatic obj = new CheckStatic();
        obj.i = 10;
        obj.show();
    }
}

class CheckStatic
{
    // int i ;  give an error  non-static variable i cannot be referenced from a static context that's why 
    static int i ;
    public static void show()
    {
        i++;
        System.out.println("HI jani");
        
    }
}