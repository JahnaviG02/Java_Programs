import java.util.Scanner;
class Num
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
   {
    int n=s.nextInt();
    for( int i=4;i<=n;i++)
     {
      if(i%4==0)
        System.out.println(i);
      }
   }
 }
}