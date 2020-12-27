/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jaani
 */
class Stu
{
int roll;
int marks;

public Stu(int roll, int marks)
{
        this.roll = roll;
        this.marks = marks;
          
}
    @Override
public String toString() 
{
    return "Stu{" + "roll=" + roll + ", marks=" + marks + '}';
}
}


public class SortingOfMarks 
{
    public static void main(String[] args) 
    {
        List<Stu> list = new ArrayList();
        list.add(new Stu(1,78));
        list.add(new Stu(2,76));
        list.add(new Stu(3,90));
        list.add(new Stu(4,67));
        list.add(new Stu(5,80));
        
//        for(int i=0; i<list.size(); i++)
//            System.out.println(list.get(i));
        
        Comparator<Stu> com = (s1,s2) ->
        {
            return s1.marks>s2.marks?-1 : s1.marks<s2.marks? 1 : 0;
        };
        
        Collections.sort(list,com);
        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        
    }
    
}
