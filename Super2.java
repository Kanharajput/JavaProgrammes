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
public class Super2 
{  
    public static void main(String[] args) 
    {
        Check2 obj = new Check2();
        obj.show();
    }
}

class Check1
{
    int i = 10;
    public void show()
    { 
        System.out.println("From show1");
    }
}

class Check2 extends Check1
{
   int i = 5;     // If there is no i here then go for Check1 but what if we want that i not this in present of it
    public void show()
    {
        super.show();
        System.out.println("Fom show2 this is the i from Check1 class" + super.i);
    }
}


