/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class DefaultConstructor 
{
    public static void main(String[] args) 
    {
        PrintConst obj = new PrintConst();          // obj is the reference of the new PrintConst obj . 
    }
    
}

class PrintConst
{

    public PrintConst()
    {
        System.out.println("It is a default constructor");
    }
      
    
}