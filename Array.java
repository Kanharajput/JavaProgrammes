
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Array 
{
    public static void main(String[] args) 
    {
    Scanner num = new Scanner(System.in);
    System.out.println("how much values you want to insert ");
    int val = num.nextInt();
    int a[] =  new int[val];
    int i;
    for(i=0;i<val;i++ )
    {
        System.out.println("Enter the " + (i+1) + " value");
        int userdata = num.nextInt();
        a[i]=userdata;      
    }
    for(i=0;i<a.length;i++)                //  Here we use length to get the number of elements in the arrray 
    {
        System.out.println((i+1)+ " value is "+ a[i] );
    }
    }   
}
