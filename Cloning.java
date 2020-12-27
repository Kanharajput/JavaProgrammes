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
public class Cloning 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
            CloneA obj = new CloneA();
            obj.i = 9;
            obj.j = 10;
            // Shallow cloning is here
            CloneA obj1 = obj;              // Here two different reference have the same object.
            System.out.println("By Shallow Cloning " + obj1.i);  
            // You can't assign different values to different variables because the object is same.
            
            
            // Now lets see the deep cloning 
            CloneA obj2 = new CloneA();
            obj2.i = obj.i;
            obj2.j = obj.j;
            System.out.println("By deep Cloning "+ obj2.i + " and " + obj2.j);
            // There is a problem with deep cloning that is as many variable as we have to copy them 
            // that's make no sense only reapet the same the line with different variables
            
            // so we move towards the clone function which is inside the clone package
            CloneA obj3 = (CloneA)obj.clone();
            obj3 .i = 11;
            System.out.println("By deep Cloning "+ obj3.i + " and " + obj3.j);
            // It's look like shallow cloning but works like deep cloning.
    }
}

class CloneA implements Cloneable   // We have to take permission to copy object through clone function using markup interface Cloneable
{
    int i ;
    int j;
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}