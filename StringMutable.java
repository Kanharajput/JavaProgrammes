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
public class StringMutable 
{
    public static void main(String[] args) 
    {
    StringBuffer str = new StringBuffer("Kanha");
    str.append(" Rajput");
    System.out.println("string is " + str);
    System.out.println("After replacing the string ");
    str.replace(0, 4, "dhalchand");
        System.out.println("Now the string is " + str);
    }
}
