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
// Final Variable
public class FinalTest 
{
    public static void main(String[] args) 
    {
         final int i = 10;     // Now i is constant 
         // i = 22;           Can't do this thing
         System.out.println("This is the i  " + i);
         Test1 obj = new Test1();
         obj.show();
    }   
}

// Final Method
final class Test1
{
    final public void show()
   {
       System.out.println("HI there");
   }
}

/**
//class Test2 extends Test1   can't extends final class
{
// public void show()  // giving an error can't override final method
{
    System.out.println("HI there it me 2");
}
}
**/