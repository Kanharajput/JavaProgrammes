
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class ExceptionHnadling 
{
    public static void main(String[] args) 
    {
     Random num = new Random();
    int a[] = new int[10];
    for(int i = 0 ; i<10;i++)
        a[i] = num.nextInt(100);
    try
    {
     System.out.println(a[33]);
    } 
    catch(Exception e)
     {
         System.out.println(" index only upto 10 "); 
     }
     } 
}
