import java.util.Scanner;
import java.lang.Math;
class L{
public static void main(String args[])
{
 Scanner S=new Scanner(System.in);
  int sum=0;
 int n=S.nextInt();
  for(int i=1;i<=n;i++)
  {
    sum=sum+(int)Math.pow(i,2);
   
   }
  System.out.println(sum);
 }
}
  