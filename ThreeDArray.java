/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class ThreeDArray 
{
    public static void main(String[] args) 
    {
            int multi [][][] = new int  [2][2][2];
            for(int i =0; i<2; i++)
                for(int j =0; j<2; j++)
                    for(int k =0; k<2; k++)
                            multi [i][j][k] = i+j+k;
            
            for(int i[][] : multi)
                for(int j[] : i)
                    for(int k : j)
                        System.out.println(k);
     }
    
}
