/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

/**
 *
 * @author Jaani
 */
public class Runner
{
    public static void main(String[] args) 
    {
//            Linkedlist list = new Linkedlist();
//            list.insert(0);
//            list.insert(2);
//            list.insert(5);
//            list.insert(29);
//            list.show();
            
            //  Making second class to use different method and practise.
            
            LinkedlistPart2 list1 = new LinkedlistPart2();
            list1.insert(2);
            list1.insert(8);
            list1.insert(5);
            list1.insert(4);
            list1.insert(9);
            list1.insertAtStart(0);
            list1.insertAt(0,66);
            list1.show();
            
            
            
    }
}
