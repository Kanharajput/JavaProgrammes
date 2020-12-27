/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaani
 */
// ForEach is an internally loop so it take less time to run
// Consumer interface have this forEach method

//class ConsumerImp implements Consumer<Integer>
//{
//        public void accept(Integer i)
//        {
//                System.out.println(i);
//        }
//}

public class ForEachMethod
{
    public static void main(String[] args) 
    {
            List<Integer> obj = new ArrayList();
            obj.add(2);
            obj.add(4);
            obj.add(6);

//             If we insert data by means of add method then it will thrown an exception.
//             this is the background process which forEach done
//             Consumer<Integer> c = new ConsumerImp();
//             obj.forEach(c);
//            make anonymous class.
//            Consumer<Integer> c = new ConsumerImp()
//            {
//            public void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//            };
//            obj.forEach(c);
//            Now we use lambda Expression
            
            obj.forEach(System.out::println);  // if there is not a object of ArrayList like Arrays.aslist(12,15,63,34,42) otherwise use it.
            obj.forEach(i -> System.out.println(i));
     }
}
