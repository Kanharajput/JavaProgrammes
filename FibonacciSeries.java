
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * first we are going to take the input from the user]
 * for taking input we use scanner 
 * @author Jaani
 */
public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter any number");
    int n = sc.nextInt();
    int k=0 ,a=1,b=1;
    System.out.print("1" + " " + "1" + " ");
    while(k<=n)
    {
        k = a+b;
        if(k>n)
            break;
        a=b;
        System.out.print(k + " ");
        b=k;
        
    }
    }
}
