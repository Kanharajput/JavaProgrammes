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
public class AnonymousObject 
{
    public static void main(String[] args) 
    {
        Abc obj = new Abc();
        obj.k = 10;
        obj.show();
        // The above is nomally way to make an object
        // Now the anonymous way 
        new Abc().k = 5;
        new Abc().show();  // Every time making an new ovject that's why k is not referenced to older k and this time new object show the defaut value of k
    } 
}

class Abc
{
    int k;
public void show()
{
    System.out.println("K is " + k);
}
}