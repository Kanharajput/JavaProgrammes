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
public class DynamicDispatch 
{
    public static void main(String[] args) 
    {
       One obj1 = new One();
       Two obj2 = new Two();
       One ab = new Two();         //  Do like this also 
       One a;
       a = obj2;
       a.show();
    }
}
// Parent class reference and object is of child class.....

class One
{
    public void show()
    {
            System.out.println("From one ");
    }
}
class Two extends One
{
    @Override
    public void show()
    {
            System.out.println("From Second");
    }
}