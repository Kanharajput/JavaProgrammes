
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
public class PerfectByMethod 
{
    public static void main(String[] args) 
    {
    Scanner digit = new Scanner(System.in);
    System.out.println("Enter the digit");
    int n = digit.nextInt();
    boolean b = isBoolean(n);
    if(b)
            System.out.println("Perfect number");
    
    else
            System.out.println("Not a Perfect Number");
    }
    
    public static boolean isBoolean(int n)
    {
    int sum =0,k=1;
    while(k<n)
    {
    if(n%k==0)
    {
        sum+=k;
        k++;
    }
    else
        k++;
    }
    if(sum==n)
        return true;
    
    return false;
    }
    
}
