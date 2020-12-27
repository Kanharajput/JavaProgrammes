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
public class MinimumThreadCode
{
    public static void main(String[] args) 
    {
       
        Thread t1 = new Thread( ()  ->
            {
                   for(int i= 0; i<5; i++)
                  {
                      System.out.println("Hi");
                      try{Thread.sleep(1000);} catch(Exception e){}
                    
                  }
             });
        
        Thread t2 = new Thread( ()  ->
            {
                   for(int i= 0; i<5; i++)
                  {
                      System.out.println("Hello");
                      try{Thread.sleep(1000);} catch(Exception e){}
                  }
             });
        
        t1.start();
        try{Thread.sleep(10);} catch(Exception e ){}
        t2.start();
    }
}


