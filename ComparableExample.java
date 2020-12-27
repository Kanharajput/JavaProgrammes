/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jaani
 */

// here we are using Comparable so that we don't have to sort the list.
class Stu1 implements Comparable<Stu1>
{
int roll;
int marks;

public Stu1(int roll, int marks)
{
        this.roll = roll;
        this.marks = marks;
           
}
    @Override
public String toString() 
{
    return "Stu1{" + "roll=" + roll + ", marks=" + marks + '}';
}

@Override
public int compareTo(Stu1 s)
{
   return this.marks>s.marks? -1 : this.marks<s.marks? 1 : 0;
}
}

public class ComparableExample
{
    public static void main(String[] args) 
    {
        List<Stu1> list = new ArrayList();
        list.add(new Stu1(1,78));
        list.add(new Stu1(2,76));
        list.add(new Stu1(3,90));
        list.add(new Stu1(4,67));
        list.add(new Stu1(5,80));
        
        Collections.sort(list);
        for(Stu1 s : list)
            System.out.println(s);
        
    }
}

