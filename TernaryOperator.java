/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class TernaryOperator 
{
    public static void main(String[] args) 
    {
        int value1 = 8;
        int value2 = 9;
        
        if(value1  == 8)
        {
            value2++;          
        }
        else 
        {
            value2--;
        }
        System.out.println(value2);
    // Same operation with the help of terniry operator
    value2 = value1==8 ? ++value2 : --value2;
    System.out.println(value2);
    
    /** Here in java ternary operator check the data type and from that the one which is greater than other one 
 * give output in that format 
 * Let's check an example 
 **/
    
    int c = 10;
    double d = 11.0;
    d = c==10?  ++d : --d;
    System.out.println(d);
    }
}

    
        
