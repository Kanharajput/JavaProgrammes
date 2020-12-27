/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.Scanner;
import static netbeans.StaticBlock.k;

/**
 *
 * @author Jaani
 */
public class MultilevelInher 
{
    public static void main(String[] args) 
    {
        Division obj = new Division();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int value1 = input.nextInt();
        obj.a = value1;
        
        System.out.println("Enter the second number ");
        int value2 = input.nextInt();
        obj.b = value2;
        
        System.out.println("What you want Addition Subtraction Multiplication Division");
        String choice = input.next();
        
         switch(choice)
         {
             case  "Addition" :
                 System.out.println(" Addition is " + obj.sum());
                 break;
                 
             case   "Subtraction":
                System.out.println(" Subtraction is " + obj.sub());
                break;
                 
             case  "Multiplication":
                System.out.println(" Multiplication is " + obj.mul());
                break;
                 
             case  "Division":
                System.out.println("Division is " + obj.div());
                break;
                 
             default: 
                System.out.println("Wrong Choice! write correct spelling :(");
         }
    }
}

class Addition
{
    int result,a,b;
    public int sum()
    {
        result = a+b;
        return result;
    }
}

class Subtraction extends Addition
{
    public int sub()
    {
    result = a-b;
    return result;
    }
}

class Multiplication extends Subtraction
{
    public int mul()
    {
    result = a*b;
    return result;
    }
}

class Division extends Multiplication   // Multilevel Inheritance  
{
    public int div()
    {
    result = a/b;
    return result;
    }
}