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
public class StaticBlock 
{
    static int k;
    static 
        {
            k = 100;   // we can assign value to the static variable inside the static class
            System.out.println("HI janni it's before main "); // i t will run when the class load means before the main method but what if there is two static block  
        }
    public static void main(String[] args) 
        {
            System.out.println("What i say  " + k);
        }
    static 
       {
        System.out.println("This is the second one "); // Let's run to check is it in structure or firstly static block then main method
        }
}
