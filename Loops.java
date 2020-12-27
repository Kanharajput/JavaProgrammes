/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Loops 
{
    // do while loop is first do what is in the braces and then check for the condition in while
    public static void main(String[] args) 
    {
        int i = 10;
        do 
        {
            System.out.println(i);
            i++;
        }while(i<20);
        
    // same loop but this time i is 1 , Lets watch what happened next
        System.out.println("When i is 21");
        i = 21;
        do 
        {
            System.out.println(i);
            i++;
        }while(i<20);
    // Got it
    // Now it's turn for while loop same procedure only do is not there
        
        i=1;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
    
    // Now think a minute if we add the three lines of condition in one then what happened 
    // It become a for loop 
        
        for(i =30;i<40;i++)
        {
            System.out.println(i);
        }
    // The three condition called as iniatialization, conditione and incrementention respectively
    }
      
}
