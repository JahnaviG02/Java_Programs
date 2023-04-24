import java.util.Scanner;
class Sample
{
 public static int digit(int m)
 {
  int count=0;
  while(m>0)
  {
    count++;
    m=m/10;
  }
 return count;
}
 public static void main(String args[])
  {
  Scanner S=new Scanner(System.in);
  int n;
  n=S.nextInt();
  int count=digit(n);
  System.out.println(count);
 }
}