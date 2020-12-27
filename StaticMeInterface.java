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
interface Kuch
{
static void toHai()      // Same as class we can call it by interface name 
    {
        System.out.println("Ha hai");
    }
}

public class StaticMeInterface 
{
    public static void main(String[] args) 
    {
        Kuch.toHai();
    }
}
