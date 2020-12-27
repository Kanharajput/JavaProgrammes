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
public class OverRiding 
{
    public static void main(String[] args) 
    {
        First obj = new First();
        obj.show();      // It will call the show method from First class
        // After extends First class to  Second show method is from SEcond class
        // This is know as method overriding
        Second obj1 = new Second();
        obj1.show();
    } 
}

class First
{
public void show()
{
    System.out.println("Hi there from first class");
}
}

class Second extends First
{
public void show()
{
    System.out.println("HI there from second class");
}
}