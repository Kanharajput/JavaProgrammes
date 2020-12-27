/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaani
 */
public class Switch 
{
    public static void main(String[] args) 
    {
    int value1 = 40;
    int value2 = 20;
    
    switch(value1)
     {
        case 50:
        {
            System.out.println("It is value1");
            break;
        }
            
        case 20:
        {
            System.out.println("It is value2");
            break;
        }
        default:
            System.out.println("It is some other digit ");
      }
    }
}
/** Jaruri suchana 
 * In case condition we can only use the constant term we can't use the varible 
 * colon is must put at the last
 * carly bracket is don't needed here 
 * use break for terminating 
 **/
