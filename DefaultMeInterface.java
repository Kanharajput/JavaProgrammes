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
interface I 
{
default void display()
    {
        System.out.println("Hi");
    }
}

interface K
{
    default void display()
    {
        System.out.println("HI");
    }
}

class C implements I,K   // In i and K same signature method is there so confusion is that which is want by user so we have to define it here with same name
{
    @Override
    public void display()
    {
        System.out.println("HI");
    }
}

class Prior
{
    public void show()
    {
        System.out.println("HI");
    }
}

class D extends Prior implements I
{

}

public class DefaultMeInterface 
{
    public static void main(String[] args) 
    {
        C obj1 = new C();
        obj1.display();
        
        D obj2 = new D();
        obj2.display();
        obj2.show();
        // If interface and class have same signature method then we have to do same as we did in class C for interface I and K
    }
}

