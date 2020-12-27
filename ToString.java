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
public class ToString 
{
    public static void main(String[] args) 
    {
        Student obj = new Student(5,"kanha");
        System.out.println(obj);   //  When print object it search for toString method which is inside Object class and by default every class extend it 
    }                                              // so we can override it . 
}

class Student
{
    int rollno;
    String name;
    
    public Student(int rollno, String name) 
    {
        this.rollno = rollno;
        this.name = name;
    }    
    
    public void dataOfStudent()
    {
        System.out.println(" Roll no : " + rollno + " Name is : " + name);
    }
    
    @Override
    public String toString()
    {
        return "Roll no is " + rollno + " Name is " + name; 
    }
}