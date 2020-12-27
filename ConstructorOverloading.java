/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        // Make different object for different type of constructor ...
        Show call = new Show();
       Show call_one_parameter = new Show(3);
       Show call_two_parameter = new Show(2,2.2);
    }
}

class Show
{
    //  Now I am going to show you Constructor Overloading.......
public Show()
{
    System.out.println("Default constructor without parameters");
}
public Show(int a)
{
    System.out.println("Parameterised constructor with one parameter");
}
public Show(int i, double f)
{
     System.out.println("Parameterised constructor with two parameter");
}
}