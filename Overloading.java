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
public class Overloading 
{
    public static void main(String[] args) 
    {
        A obj = new A();
       obj.show();            // guess which show comes out.......
        obj.show(98);         // integer variable can use the float parameterized method
    }
}

class A
{
public void show()
{
    System.out.println("HI there ");
}

public void show(float a )     // method overloading 
{
    System.out.println("HI there from integer method");
}
}
