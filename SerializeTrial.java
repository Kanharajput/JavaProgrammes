/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Jaani
 */
public class SerializeTrial
{
    public static void main(String[] args) throws Exception
    {
        CopyThisObj obj = new CopyThisObj();
        obj.i = 19;
        CopyThisObj obj1 = new CopyThisObj();
        obj1.i = 20;
        
        // Saving a obj to the file 
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Jaani\\Desktop\\save_obj.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        
        // Getting the output from the saved file.
        
        FileInputStream fis = new FileInputStream("C:\\Users\\Jaani\\Desktop\\save_obj.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        obj1 = (CopyThisObj) ois.readObject();
        System.out.println(obj.i);

    }
}

class CopyThisObj implements Serializable 
{
int i;
}