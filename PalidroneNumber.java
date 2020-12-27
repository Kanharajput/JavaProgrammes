    
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
public class PalidroneNumber 
{
    public static void main(String[] args) 
    {
    int r,s=0,k;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number which you want to check");
    int n = input.nextInt();
     k=n;
    while(n>0)
    {
        r=n%10;
        n=n/10;
        s=s*10+r;
    }
    if(k==s)
            System.out.println("It is a palidrone number");
    else
            System.out.println("NOt a palidrone number");
            
    }  
}
