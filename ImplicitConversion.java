/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class ImplicitConversion // If there is not a integer parameter construvtor and we pass the value 
                                                       //then double parameterised contstructor get in work  this is known as implicit conversion
{                                                     // but this not work in reverse versa
    public static void main(String[] args) 
    {
        New obj = new New(2);
    }
}

class New 
{
    public New(double i)
    {
        System.out.println("From double function ");
    }
}    
//public New(int j)
//{
//    System.out.println("From Integer function ");
//}
//}