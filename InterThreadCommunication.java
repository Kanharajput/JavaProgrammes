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
class Geeta  
{
    int num;
     boolean setvalue = false;
    public synchronized void put(int num)
    {
        while(setvalue)
        {
            try{wait();} catch(Exception e){}
        }
        this.num = num;
        System.out.println("Put " + this.num);
        setvalue = true;
        notify();
    }
    
    public  synchronized void get()
    {
        while(!setvalue)
        {
            try{wait();} catch(InterruptedException e){}
        }
        System.out.println("Get " + num);
        setvalue = false;
        notify();   // without this your code is work fine sir say that it will notify Producer to work and notify of put notify Consumer. it need synchronized.
    }
}

class Producer implements Runnable
{
    Geeta g;
    public Producer(Geeta g)
    {
        this.g = g;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }
    
    public void run() 
    {
        int i = 0 ; 
        while(true)
        {
            g.put(i++);
            try {Thread.sleep(1000); } catch(Exception e){}
        }
    }
}

class Consumer1 implements Runnable 
{
    Geeta g ;
    public Consumer1(Geeta g)
    {
        this.g = g;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();
    }
    
    public void run()
    {
        while(true)
        {
            g.get();
            try{Thread.sleep(1000);} catch(Exception e){}
        }  
    }
}



public class InterThreadCommunication
{
    public static void main(String[] args) 
    {
        Geeta g = new Geeta();
        new Producer(g);
        new Consumer1(g);
    }
}
