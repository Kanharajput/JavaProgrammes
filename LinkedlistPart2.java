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
// this class only work with Runner and node there is no connection between Linkedlist class
public class LinkedlistPart2 
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
                    Node n = new Node() ;
                    n = head;
                    while(n.next!= null)
                            n = n.next;
                    
                    n.next = node;
            }
    }
    
    public void show()
    {
            Node n = new Node();
            n = head;
            while(n.next!= null)
            {
                    System.out.println(n.data);
                    n = n.next;
            }System.out.println(n.data);
    }
    
    public void insertAtStart(int data)
    {
            Node newhead = new Node();
            newhead.data = data;
            newhead.next = head;
            head = newhead;
    }
    
    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        Node n =  head; 
        
        if(index == 0)
                insertAtStart(data);
        
        else
        {
                for(int i= 0; i<index-1; i++)
                        n = n.next;
           
                node.next = n.next;
                n.next = node;
                
        }
    } 
}
