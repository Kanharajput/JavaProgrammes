/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JButton;

/**
 *
 * @author Jaani
 */
public class SerializationaPractise
{
    public static void main(String[] args) 
    {
        try
        {
        SaveXml save = new SaveXml();
        save.setI(10);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Jaani\\Desktop\\trial.xml");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        XMLEncoder xml = new XMLEncoder(bos);
        xml.writeObject(bos);
        xml.close();
        }
        catch (FileNotFoundException ex)
         {
             System.out.println("File is not there");
          }
    }
}
 
class SaveXml
{

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
   private int i;
    String name = "kanha";

}
        