/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Jaani
 */
public class PropertyFiles 
{   
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("C:\\Users\\Jaani\\Desktop\\property.txt");
        /**
         *  No matter what you are using OutputStream is an abstract class which is extended by 
         * FileOutputStream so we can use it and parent class reference with
         * subclass object is easy to use in java.
         */
        p.setProperty("username", "kanha");
        p.setProperty("pass", "1234");
        p.store(os,null);
    
        
         // Now let's talk about InputStream
        InputStream is = new FileInputStream("C:\\Users\\Jaani\\Desktop\\property1.txt");
        p.load(is);
        System.out.println(p.getProperty("username")); 
        System.out.println(p.getProperty("pass"));
        
        
    }

}
