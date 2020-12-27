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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jaani
 */
// Here we are using the three java classes SerializeXml , Students and College.
public class SerializeXml 
{
    public static void main(String[] args) 
    {
        try {
        Students st1 = new Students();
        st1.setRollno(15);
        st1.setSname("Kanha");
        
        Students st2 = new Students();
        st2.setRollno(20);
        st2.setSname("Rajput");
        
        List<Students> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);
        
        College c = new College();
        c.setStudents(s);
        
       
        XMLEncoder xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("C:\\Users\\Jaani\\Desktop\\xml_file.xml")));
        xe.writeObject(c);
        xe.close();
        
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
}
