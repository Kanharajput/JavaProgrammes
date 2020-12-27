/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class LabeledBreak 
{
    public static void main(String[] args) 
    {
        /**
        int i , j;
        for(i=1;i<=5;i++)
        {
            for(j=1; j<=4; j++)
            {
                if(i==3)
                    break;       // this break only break for the condition i=3 after that it will not affect the flow of code
                System.out.print("# ");
            }
            System.out.println("");
        }
        **/
         int i,j;
        stop:           // this is a label for the loop
        for(i=1;i<=5;i++)
        {
            for(j=1; j<=4; j++)
            {
                if(i==3)
                    break stop;       // this is a label break in which label the loop and then put it after the break and it will stop the main loop because we labeled the outer loop 
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
    
}
