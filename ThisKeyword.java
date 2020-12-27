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
public class ThisKeyword 
{
    public static void main(String[] args) 
    {
        ConfirmThis obj = new ConfirmThis(10);
        obj.show();
        System.out.println(ConfirmThis.kanha);            // Checking class variable
    }
}

class ConfirmThis
{
    static int kanha;           // class variable
    private int x;                // instance variable
    public ConfirmThis(int x)          // local variable
    {
        this.x = x;    // without this it will assign the value the local variable not the instance variabel 
    }
    
    public void show()
    {
        System.out.println("X is " + x);    // output is X is 0 because 10 save to local variable not instance variable and we are asking for instance variable
    }
}