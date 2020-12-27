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
class N
{
        public void display()
                {
                      System.out.println("My name is lakhan");  // Now this method is called not the previous method 
                }
}

//class P extends N  // ONly purpose of this class to override the display method nothing more than it.
//{
//        public void display()
//                {
//                      System.out.println("My name is lakhan");  // Now this method is called not the previous method 
//                }
//}



public class AnonymousClass 
{
    public static void main(String[] args) 
    {  
            N obj = new N() // don't need that p class because we can directly define or override that method here
            {
               public void display()
                    {
                          System.out.println("My name is lakhan");  // Now this method is called not the previous method 
                    }
            };
            obj.display();
    }
      
}
