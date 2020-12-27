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
public class Super 
{
    public static void main(String[] args) 
    {
        Rajput obj = new Rajput(6);
    }
}



class Kanha extends Object
{
    public Kanha()
   {
       System.out.println("From default const of Kanha"); 
   }

    public Kanha(int i)
   {
       System.out.println("From parameterized const of Kanha"); 
   }
}




class Rajput extends Kanha
{
    public Rajput()
    {
       super();  // Automatically is there
        System.out.println("From default const of Rajput");
    }
    
    public Rajput(int i)
    {
        super(i);
        System.out.println("From parameterized const of Rajput");
    }
}