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
class ThreadClass extends Thread
{
    public void run()
    {
        System.out.println("Hi there");
    }
}

public class ThreadNamePriority 
{
    public static void main(String[] args) throws Exception
    {
        ThreadClass obj = new ThreadClass();  
        obj.start();
        obj.join();
        obj.setName("First thread");                                               // we can also set the name of thread
        System.out.println(obj.getName());                                 // to get the name of the thread
        
        // About priority
        System.out.println(obj.getPriority());               
        obj.setPriority(1);              // one is the least priority five is the normal priority and 10 is the highest priority 
        // we can also set by obj.setPriority(Thread.MinPriority) same as max priority
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(Thread.NORM_PRIORITY);
        System.out.println(obj.getPriority());
        
    }
    
}
