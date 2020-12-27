/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Jaani
 */
public class NewFile
{
    public static void main(String[] args) throws Exception
    {
           File f = new File("C:\\Users\\Jaani\\Desktop\\first.txt");
           FileOutputStream fos = new FileOutputStream(f);
           DataOutputStream dos = new DataOutputStream(fos);
           dos.writeUTF("It's cool");
           
           
           FileInputStream fis = new FileInputStream("C:\\Users\\Jaani\\Desktop\\first.txt");  // can't read java files :) 
           DataInputStream dis = new DataInputStream(fis);
           String str = dis.readUTF();
           System.out.println("Output from the file is " + str);
    }
}
