
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
public class TwoDArray 
{
public static void main(String[] args) 
{   
int values[][] = {
                      {1,3,4,5},
                      {6,7,8,9},          // Here two d array not only two array it means two sided array  
                      {0,1,2,3},
                            };

for(int r = 0;  r<3;  r++)
{
    for(int c = 0;  c<4; c++)
           System.out.print(values[r][c] + " ");
System.out.println(" ");
}

// Way to take input in 2d array
Scanner sc = new Scanner(System.in);
for (int row =0 ; row<2;row++)
{
    for(int column= 0;column<2;column++)
    {    
        System.out.println("Enter the value which is set at index number " + row +column);
         int num = sc.nextInt();
    }
    System.out.println(" ");
    System.out.printf("");
}
}
}
