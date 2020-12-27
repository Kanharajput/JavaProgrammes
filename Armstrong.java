
import java.util.Scanner;
import static javafx.scene.input.KeyCode.I;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Armstrong 
{
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number which you want to check ");
    int n = input.nextInt();    
    int r,sum = 0 ;
    int temp;
    temp = n;
    while(n>0)
    {
        r=n%10;
        n=n/10;
        sum = sum + r*r*r;
    }
   
    if(temp == sum)
            System.out.println("it is an Armstong number");
    
    else
            System.out.println("IT is not an Armstong number");
    }
    
}
