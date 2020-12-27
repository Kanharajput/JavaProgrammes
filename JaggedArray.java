
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
////////// */

/**
 *
 * @author Jaani
 */
public class JaggedArray 
{
    public static void main(String[] args) 
    {
    int a[][]    = {
                            {1,2,3,4},
                            {5,6,},                     // This is know as Jagged Array
                            {9,10,11},
                        };
    int k[][] = new int [3][];          // Here it is fix that we have three rows and columns are unformed so leave it blanck 
    k[0] = new int [4];    // It will assign number column in first row 
    k[1] = new int[2];     // second row
    k[2] = new int[3];     // third row
    
    Scanner input = new Scanner(System.in);
    for(int i=0; i<3;i++)
    {
    for(int j=0; j<k[i].length; j++)
    {
        System.out.println("Enter the number which for index number "  + i  + j);
        int num = input.nextInt();
        k[i][j] = num;
    }
    }
    
    for(int i[] : k)
    {
    for(int j:i)
    {
        System.out.print(j + " ");
    }
        System.out.println("");
    }
    
    } 
}
