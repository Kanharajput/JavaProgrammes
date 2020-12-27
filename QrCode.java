/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author Jaani
 */
public class QrCode 
{
    public static void main(String[] args) throws Exception
    {
            String inside_qr = "Tu chutiya hai ";
            ByteArrayOutputStream out = QRCode.from(inside_qr).to(ImageType.JPG).stream();
            File f = new File("E:\\QrCode\\secondQr.jpg");
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(out.toByteArray());
            fos.flush();
    }
    
}
