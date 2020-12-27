
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Calculator 
{
    public static void main(String[] args) 
    {
        float  result ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number " );
        float first_value = input.nextFloat();
        System.out.println("Enter second number " );
        float second_value= input.nextFloat();
        System.out.println("Enter the operand from this  +   -   *   / ");
        String operand = input.next();
        switch(operand)
        {
            case "+" : result = first_value + second_value;
                              System.out.println("Sum is " + result);
                              break;
            
            case "-" : result = first_value - second_value;
                              System.out.println("Subtraction is " + result);
                              break;
           
            case "*" :  result = first_value * second_value;
                              System.out.println("Multiplication is " + result);
                              break;
            
           case "/" :  result = first_value / second_value;
                              System.out.println("Division is " + result);
                              break;
                
            default : System.out.println("Wrong operand");
        }
        
    }
    
}
