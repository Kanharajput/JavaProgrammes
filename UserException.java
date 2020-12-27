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
public class UserException 
{

    public static void main(String[] args) 
    {
        int i = 5;
        try 
        {
            if (i < 10) 
            {
                throw new MyException("Erroorrr");
            }

        } 
        catch (MyException e) 
        {
            System.out.println(e);          // Erroorrr will be shown by this 
            System.out.println("I is less 10 ");
        }
    }
}

class MyException extends Exception
{
    public MyException(String str) 
    {
             super(str);        // without it only I is less than 10 is shown
    }
}
