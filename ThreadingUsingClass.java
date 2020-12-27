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
public class ThreadingUsingClass
{
    public static void main(String[] args) 
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        try{Thread.sleep(10);} catch(Exception e ){}
        obj2.start();
    }
}

class Hi extends Thread
{
    int i =0 ;
    @Override
    public void run()
    {
            while(i <5)
           {
               System.out.println("Hi");
               try{Thread.sleep(1000);}  catch(Exception e) {}
               i++;
           }
    }
}

class Hello extends Thread
{
     int i =0 ;
     @Override
     public void run()
     {
            while(i <5)
           {
               System.out.println("Hello");
               try{Thread.sleep(1000);} catch(Exception e){}
               i++;
           }
     }

}