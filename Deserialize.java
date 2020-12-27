/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jaani
 */
public class Deserialize 
{
    public static void main(String[] args) 
    {
        try 
        {
            XMLDecoder xd = new XMLDecoder(new BufferedInputStream(new FileInputStream("C:\\Users\\Jaani\\Desktop\\xml_file.xml")));
            College c = (College)xd.readObject();
            List<Students> s = c.getStudents();
            
            for(Students value : s)
            {
                System.out.println(value);
            }
        }
        
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Deserialize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
