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
public class DifferentTricksInReflection
{
    public static void main(String[] args) throws Exception
    {
        Class c = Class.forName("netbeans.Test");
        System.out.println(c.isInterface());
        System.out.println(c.getName());
        System.out.println(c.getSuperclass());
    }
}
