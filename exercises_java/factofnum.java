import java.util.Scanner;
class F
{
 public static void main(String args[])
  {
     int fact=1;
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    for( int i=1;i<=n;i++)
    {
    fact=fact*i;
    }
     System.out.println(fact);
   }
}