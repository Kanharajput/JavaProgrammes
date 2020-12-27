
package netbeans;

public class JoinIsAlive 
{
    public static void main(String[] args)  
    {
    Thread t1 = new Thread( ()  ->
            {
                for(int i = 0; i<5; i++)
                {
                    System.out.println("Jay mahesmati");
                    try{Thread.sleep(1000);}  catch(Exception e){}  
                }
            });
    
    Thread t2 = new Thread( ()  ->
                   {
                       for(int i = 0; i<5; i++)
                            {
                            System.out.println("Jay maharana");
                            try{Thread.sleep(1000);}  catch(Exception e){}
                            }
                    });
    
    t1.start();
    try{Thread.sleep(10);}  catch(Exception e){}
    t2.start();
    
        /** System.out.println("Jay Hind ");    If we want to print this Jay HInd after that all stuff we can't do it normally because our main thread is free to do 
       * this stuff so we have to make main thread to take rest while our two working thread got done their job
       * */
    
    try{t1.join();} catch(Exception e ){}
    try{t2.join();} catch(Exception e ){}
    System.out.println("Jay Hind");
    
    // if we want to check threadd is working or not! then we can check it by means of a method alive 
    
        System.out.println(t1.isAlive());
    
    }
}
