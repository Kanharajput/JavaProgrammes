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
interface M   // This blank interface is known as marker interface  
{   // It is made for privacy matter lets watch how it work
}

class SecureMethod implements M  // If we not implements M then else condition will be right 
{
    public void show()
    {
        System.out.println("Got it");
    }
}

public class MarkerInterface
{
    public static void main(String[] args) 
    {
      SecureMethod obj = new SecureMethod();
      
      if (obj instanceof M)  // Checking obj have the M interface or not  
             obj.show();
      
      else
            System.out.println("Your are not the valid user");
    } 
}

