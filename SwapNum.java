/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class SwapNum 
{
    public static void main(String[] args) 
    {
        // first way to swap the numbers
    /**    
    int a =5;
    int b = 4;
    int temp;
    temp = a;
    a=b;
    b=temp;
        System.out.println("A is " + a);
        System.out.println("B is " + b);
    **/
        // it is the second way by this we can save the memory which was used by temp
   /**
    int k= 8;
    int t= 9;
    k=k+t;
    t= k-t;
    k=k-t;
        System.out.println("K is " + k);
        System.out.println("T is " + t);
    **/
        // Now we are going to use third metod which is applicable to save a bite 
        // like in 8 and 9 there is all about 1000 and 1001 but in 17 that is 10001
    
    int value1=9;   // 1001
    int value2=8;   // 1000
       
    // here we exhauste or we can say that we simply use the XOR operation
    // ^ -> XOR     1 1 -> 0    1 0 -> 1    0 1 -> 1    0 0 -> 1   
    
    value1 = value1^value2;     //1001 XOR 1000 -> 0001
    value2 = value1^value2;     //0001 XOR 1000 -> 1001
    value1 = value1^value2;     //0001 XOR 1001 -> 1000
        System.out.println("value1 is " + value1);
        System.out.println("value2 is " + value2);
    }
}
