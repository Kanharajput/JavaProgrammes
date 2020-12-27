/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jaani
 */
public class Trial 
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();   
         int a[] = new int[5]; 
        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) 
        {
        a[i] = Integer.parseInt(strs[i]);   
            System.out.println(a[i]);
        }   
    }
}
