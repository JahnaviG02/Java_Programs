import java.util.*;
class MaxVowelsString
{
 public static int vowelsCount(String s1)
  {
   int count=0;
   String vowels="AEIOUaeiou";
   for(int i=0;i<s1.length();i++)
   {
    if(vowels.contains(s1.charAt(i)+""))
      count++;         
   }
   return count;
  }
 public static void main(String[] args)
 {
  String line;
  Scanner sc=new Scanner(System.in);
  line=sc.nextLine();
  String s[]=line.split(" ");
  int max=-1,index=-1;
  for(int i=0;i<s.length;i++)
  {
     int c=vowelsCount(s[i]);
     if(c>max)
     {
       index=i;
       max=c;
     }
  }
  if(index==-1)
    System.out.println("-1");
  else
    System.out.println(s[index]);
  sc.close();
 }
}