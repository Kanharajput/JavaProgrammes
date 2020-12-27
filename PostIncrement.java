/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * There are two types of increment Post Increment and Pre Increment 
 * here all about PostIncrement
 * @author Jaani
 */
public class PostIncrement {
    public static void main(String[] args) 
    {
    
        int i = 30 , j;
        j = i++;
        System.out.println("j is " +j+ "and i is " + i);
    
/** Here Post Increment work in this layout ->
 * first the value is assign to the variable 
 * like temp = i here i = 30
 * then the i is get incremented to 31
 * but the new incremented value is not assign to the variable temp , so temp is 30
 * then again assignment is done but this time that is i 
 * so i = temp which is 30 
 * but for the next time i is 31
 **/
 
        int kanha = 10; 
        kanha++;     // kanha = kanha + 1 
        System.out.println(kanha);
    
        /** Here is the simple operation  
         **/  
    }
}
 