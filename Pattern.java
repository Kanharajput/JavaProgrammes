/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */

// By this code we got think easy way to solve a problem otherwise you get nothing other than confusion ,m;
public class Pattern 
{
    public static void main(String[] args) 
    {          
        int k;
        for(int i=0; i<4; i++)
        {
          for(int j=1; j<=4; j++)
          {
              k= j+i;
              if(k > 4)
              {
               k=k-4;
               System.out.print(k);             
              }
              else
              System.out.print(k);
              
          }
        System.out.println("");  
        }
    }
}
