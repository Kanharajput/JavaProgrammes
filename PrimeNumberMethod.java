
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
public class PrimeNumberMethod 
{
    public static void main(String[] args) 
    {
    Scanner num = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = num.nextInt();
    boolean data =isPrime(n);
    if(data)
            System.out.println("It is a prime number");
    else 
            System.out.println("It is not a prime number");
    }
    
    public static boolean isPrime(int givennum)
    {
    int divisor=1, sum=0;
    while(divisor<=givennum)
    {
    if(givennum%divisor==0)
    {
        sum+=divisor;
        divisor++;
    }
    else
        divisor++;
    }
    
    if(sum==givennum+1)
        return true;
    else
        return false;
    }
}
