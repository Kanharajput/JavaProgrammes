/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Varargs
{
    public static void main(String[] args) 
    {
        Display obj = new Display() ;    
        obj.show(5,6,8,10);          //   we pass one parameter and it get to business but what if we pass two or three or five not fix each time  then how many times
        obj.show(10);         //   we overload the function that's why we use this varargs means variable argument Let's see how it work :) **/
    }
}
    // Making new class Display 
 class Display
{
    public void show(int a)
    {
         System.out.println("value is " + a + " from one argument method");
    }
    public void show (int ... a)         // if user pass more than one arguement then object use this method 
    {
        for(int i : a)
            System.out.println("value is  " + i +  " from varargs");
    }
 }

/** one question is there if there is only one argument an this two methods are there then which method is going to show the output ?
*Answer one argument method is going to work because by default it is made for one argument not for other .
*Tip : argument should be of same type assume it just like an array
* */