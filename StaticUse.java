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
public class StaticUse 
{
    public static void main(String[] args) 
    {
    Objects obj1 = new Objects();      
    Objects obj2 = new Objects();
    int counting =  Objects.objectCount;
    System.out.println("Number of objects of class Objects are " + counting);
    }
}
class Objects
{
    public static int objectCount = 0;
    public Objects()
    {
        objectCount++;
    }
}