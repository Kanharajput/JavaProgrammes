/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Designs 
{
    public static void main(String[] args) 
    {
        int i,j, k=1; 
        for(i=0; i<4; i++ )    
        {
            for(j=0; j<4; j++)
            {
                if(j==k)                 
                    break;
                System.out.print("# ");
            }
            k++;
            System.out.println("");
        }
    }
}
