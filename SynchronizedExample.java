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
class Counter 
{
    int count;
    public synchronized void count()
        {
                count++;
        }
}

public class SynchronizedExample
{
    public static void main(String[] args) throws Exception
    {
        Counter obj = new Counter();
        //Now let's make two threads and run the method thousand times 
        
        Thread t1 = new Thread(new Runnable() 
                                {
                                    int count;
                                    @Override
                                     public void run()
                                     {
                                         for(int i = 1; i<=1000;i++)
                                            obj.count();
                                     }   
                                } );
        
        Thread t2 = new Thread(new Runnable()
                                {
                                    int count;
                                    @Override
                                     public void run()
                                     {
                                         for(int i = 1; i<=1000;i++)
                                            obj.count();
                                     }   
                                });
       
        
        t1.start();
        t2.start();           // It will never give output 2000 because in 2000 times sometimes both the thread reach the count same time 
                                                                 //and get same value to increament and by this way we get a no. less than the actual value. 
                                                                 // so to solve it we have to synchronized our class means one thread work at a once.
        t1.join();
        t2.join();
        System.out.println(obj.count);
        
        
    }
}
