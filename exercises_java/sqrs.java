import java.util.Scanner;
class Num
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
   {
    int sum=0;
    int n=s.nextInt();
    for( int i=1;i<=n;i++)
     {
     sum=sum+(int)Math.pow(i,2);

      }
     System.out.println(sum);
   }
 }
}