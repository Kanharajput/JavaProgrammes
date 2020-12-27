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
// Main class is in the Runner . Node is also a class.
public class Linkedlist 
{
        Node head;
        public void insert(int data)
        {
                Node node = new Node();
                node.data = data;
                node.next = null;
                
                if(head == null)
                    head  = node;
                
                else
                {
                        Node n = head;
                        while(n.next!= null)
                                n = n.next;
                        
                        n.next = node;
                }
        }
        
        public void show()
        {
                Node no = head;
                while(no.next!= null)
                {
                        System.out.println(no.data);
                        no = no.next;
                }
                System.out.println(no.data);
        }
}
