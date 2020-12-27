
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
public class PrimeNumber 
{
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number which you want to check for");
    int n =input.nextInt();
    int k=1;
    int value=0;
    while(k<=n)
    {
    if (n%k==0)
    {
        value+=k;
        k++;
    }
    else
        k++;
    }
    if(value==n+1)
            System.out.println("It ia a Prime Number");
    
    else
            System.out.println("It is not a Prime Number");
    }
    
}
