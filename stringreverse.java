 import java.util.*;
class Re
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
System.out.println("enter string");
String str=S.nextLine();
 String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
           rev=rev+ str.charAt(i);  
        }
        System.out.println(rev);
}
}