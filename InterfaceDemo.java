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
interface CheckInterface      // One one method this is single method interface
{
void show();
}

class ImpInterface implements CheckInterface
{
    public void show()
    {
        System.out.println("HI DAaYa");
    }
    
    public void display()
    {
        System.out.println("Wah Bhaiya");
    }
}

public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
    CheckInterface obj = new ImpInterface();
    obj.show();
    // obj.display();  Can't work here because reference is of CheckInterface so only that interface method can call for security purpose
    }
}
