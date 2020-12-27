/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class EnhancedForLoop 
{
    public static void main(String[] args) 
    {
      int number [] = {9,3,56,6,3,5};
      for(int i : number)    //    Here i is referenced to the array number 
            System.out.println(i);
    }
}
