public class Swap
{
public static void main(String a[])
{
int value1 = 9;
int value2 = 8;
System.out.println("value1  : " + value1 +  " || " + " value2  :  " + value2 );
System.out.println("Values after Swaping");
value1 = value1^value2;
value2 = value1^value2;
value1 = value1^value2;
/** here we use the XOR rule in which following steps takes place 
 number is converted into the binary 
 like 8 equals 1000 and 9 equals 1001
 Now XOR 1 0 0 0 * 1 0 0 1 here  1 1 = 0 , 1 0 = 1 , 0 0 = 0 and 0 1 = 1
 so value1 is 0 0 0 1
 and then value2 is 1 0 0 0 * 0 0 0 1 = 1 0 0 1
 and then again value1 = 0 0 0 1 * 1 0 0 1 = 1 0 0 0
**/     
System.out.println("value1 :  " + value1 + " || " + " value2  :  " + value2 );
}
}