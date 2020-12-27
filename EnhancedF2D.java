
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
public class EnhancedF2D 
{
    public static void main(String[] args) 
    {
        int values[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);

        for(int i =0 ;i<2;i++)
        {
            for(int j =0 ; j<2; j++)
            {
                System.out.println("Enter the number which you want to insert at index " + i +j );
                int input = sc.nextInt();
                values[i][j] = input;
            }     
        }
        // Now we move towards the Enhanced for loop in 2d array
        for(int k[] : values)
        {   
            for(int t : k)
            {     
                System.out.print(t + " ");
            }    
            System.out.println(" ");
        }  
    }
}
