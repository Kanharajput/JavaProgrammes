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
public class StringSplit 
{
    public static void main(String[] args) 
    {
            String str = "kanha ,kuldeep ,mohit ,laddu,rudra";
            String friends[] = str.split(",");
            System.out.println("Friends are ");
            for(String names : friends)
            System.out.println( names);
            
            
            
    }
}
