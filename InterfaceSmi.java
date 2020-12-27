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
interface Smi      // One one method this is single method interface
{
void show();
}


public class InterfaceSmi  
{
    public static void main(String[] args) 
    {
    // Another way to make object of interface without class but it work only with SMI 
    // This is feature is after java 1.7
    Smi obj = () -> System.out.println("Gajab na.....");
    obj.show();
    }
}
