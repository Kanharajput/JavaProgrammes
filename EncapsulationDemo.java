/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

/**
 *
 * @author Jaani
 */
public class EncapsulationDemo 
{
    public static void main(String[] args) 
    {
        Check obj = new Check();
//        obj.value = 5; 
//        obj.name = "kanha";    not work because name and value have private access
    obj.setValue(100);
    obj.setName("kanha");
    System.out.println(obj.getValue());
    System.out.println(obj.getName());
    }
}

class Check
{ 
private int value;
private String name;

    public int getValue() 
    {
        return value;
    }

    public void setValue(int value) 
    {
        this.value = value;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
}