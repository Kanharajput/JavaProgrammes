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
public class SingleLevelInher 
{
    public static void main(String[] args) 
    {
        CalSub obj = new CalSub();
        System.out.println("Sum is " + obj.sum(4,8));
        System.out.println("Sub is " + obj.sub(4,8));
    }
}

class CalAdd
{
int result;
public int sum(int a,int b)
{
result = a+b;
return result;
}
}

class CalSub extends  CalAdd                // Single level Inheritance..............
{
//  int result;   By inheriting the class we also inherit the member variable which are not private  
public int sub(int a, int b)
{
result = a-b;
return result;
}
}