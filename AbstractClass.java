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
public class AbstractClass 
{
    public static void main(String[] args) 
    {
        Nokia nok = new Nokia();         // Making object of Nokia
        Iphone ip = new Iphone();        // Making object of Iphone
        Repairshop(ip);
    }
    
    public static void Repairshop(Phone p)        // Phone comes to repair shop no matters which phone  is that it takes both the phone
    {       
        p.repair();                                                   // reference of parent class and obj of subclass can work here  . Object call the specific function of that class
    }
}

abstract class Phone
{
abstract public void repair();
}

class Nokia extends Phone             //   extends Phone class
{
    @Override 
    public void repair()               // override repair method of phone class
    {
        System.out.println("Nokia Repairing...........");
    }
    
    public  void call()
    {
        System.out.println("Calling via Nokia");
    }
    
    public void sms()
    {
        System.out.println("messaging via Nokia");
    }
}

class Iphone extends Phone
{
    @Override
    public void repair()                                   // Override repair method of phone class
       {
        System.out.println("Iphone Repairing...........");
    }

    public void call()
    {
        System.out.println("Calling via Iphone");
    }
    
    public void sms()
    {
        System.out.println("messaging via Iphone");
    }
}