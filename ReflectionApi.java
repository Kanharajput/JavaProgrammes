/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.lang.reflect.Method;

/**
 *
 * @author Jaani
 */
public class ReflectionApi
{

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception      
    {
        Class c = Class.forName("netbeans.Test");       // Now let's call the private method of test class by means of reflection API
        Test t = (Test)c.newInstance();
        Method m  = c.getDeclaredMethod("show", new Class[] {int.class});  // This is the way to call parameterized private method if there is no parameter than use null
        m.setAccessible(true);
        m.invoke(t, 10);
    }
}
