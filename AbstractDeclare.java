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
public class AbstractDeclare 
{
    public static void main(String[] args) 
    {
      KuldeepLaptop lap = new KuldeepLaptop();
      lap.mike();
    }
}

abstract class KanhaLaptop           // can't make object because it is an abstract class
{
    public abstract void mike();
    public abstract void speaker();
    
    public void code()
    {
        System.out.println("It can");
    }
    
    public void turn180()
    {
        System.out.println("It can");
    }
}

class KuldeepLaptop extends KanhaLaptop           // There is not abstract method here so we can make object of it
{
    public void mike()
    {
        System.out.println("It can");
    }
    
    public void speaker()
    {
        System.out.println("It can");
    }
}