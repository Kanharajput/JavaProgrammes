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

// where to use Comparator while we have Comparable
// 1. when a class can't implement Comparable then we have to use it .
// 2. when we have to compare a list on different parameter so we can't use Comparable because it compare on one parameter and for next one we
//     we have to change that (toCompare) method so here work with comparator because as many parameter as many objects of comparator we can
//    create.



public class CompratorExample 
{
    public static void main(String[] args) 
    {
            List<Integer> obj = new ArrayList();
            obj.add(904);
            obj.add(579);
            obj.add(437);
            obj.add(752);
            obj.add(106);

    // Let sort it in ascending order
            Collections.sort(obj);
            System.out.println("Ascending order");
            obj.forEach(i -> System.out.println(i));
   // Descending order
            Collections.reverse(obj);
            System.out.println("Descending order");
            obj.forEach(i -> System.out.println(i));
    // Let it compare by means of last digit and arrange in ascending order
    // For that we use Comparator interface.
            Comparator<Integer> com = new ComImpl();
            System.out.println("Comparing last digit of given numbers");
            Collections.sort(obj,com);
            obj.forEach(i -> System.out.println(i));
   // Now Use what we learn here we apply anonymous class anonymous object and lambda expression
            Comparator<Integer> com1 = (o1,o2) ->
                        {
                            //  if(o1%10>o2%10)    //%10 will give us the last digit
                            //   return 1;
                            //   return -1;
                            return (o1%10>o2%10)?1:-1;
                        };
            Collections.sort(obj,com1); // we can also pass the obj com1 here which anonymous object . But fo simplicity I remain as it is.
          
    }
    
}

class ComImpl implements Comparator<Integer>
{
        @Override
        public int compare(Integer o1, Integer o2) 
        {
                if(o1%10>o2%10)    //%10 will give us the last digit
                    return 1;
                return -1;
        }
}
