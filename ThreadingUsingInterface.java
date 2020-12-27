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
public class ThreadingUsingInterface
{
    public static void main(String[] args) throws Exception
    {
        Hi1 obj1 = new Hi1();
        Hello2 obj2 = new Hello2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        Thread.sleep(10);
         t2.start();
    }
}

class Hi1 implements Runnable
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

class Hello2 implements Runnable
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