
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
public class PerfectNumber 
{
    public static void main(String[] args)
    {
     
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
     int n = input.nextInt();
     int k=1,s=0;
     while(k<n)
     {
        if(n%k==0)
        {  s+=k;
            k++;
        }
        else
             k++;
     }
     if(s==n)
            System.out.println("It is a perfect number");
     
     else
            System.out.println("It is not a perfect number");
    }
}
