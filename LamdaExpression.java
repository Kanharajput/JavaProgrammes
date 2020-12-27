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
// Lets see how lamda Expression work.

interface Y<Integer>
{
        // To use this interface we have to implement it 
        public void show(int i);
}

public class LamdaExpression 
{
        public static void main(String[] args) 
        {
                Y<Integer> obj = i ->  System.out.println(i);   // This is how it work.
                obj.show(9);
        }
}

/**
    Here first of all we need a class to implements YIml  interface 
     class YIml implements  Y<Integer>
      {
      public void show(int i)
      {
      sout(i);
      }
     }
     IN psvm
      {
      Y<Integer> obj = new YIml();
      obj.show(9);
      
      Here we only create that class to override that show method which is in Y interface, so here we can directly done it by means of Anonymous class.
     Y<Integer> obj = new YIml()
     {
     public void show(int i)
     {
     sout(i);
     }
     };
      
     From java 8 there is some new feature which let us to write less work more. One from them is Lambda Expression
     we can remove this code lines of code.
     new YIml()
     {
     public void show
     we can remove this code because we are overriding only one method which is inside Y interface so it is obvious that , that was that.
     so now the code it only but we have to use this sign to represent that we are working with lambda expression.
     Y<Integer> obj = (int i) ->   
     sout(i);
      we can remove curly braces because there is only one statement and we can also remove bracket from (int i) but only if there is only one arguement.
      so now the code is 
      Y<Integer> obj = int i -> sout(i);
**/