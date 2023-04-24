import java.util.Scanner;
class A
{
 public static void main(String args[])
 {
  Scanner S=new Scanner(System.in);
   int n=S.nextInt();
   int ages[]=new int[n];
   for(int i=0;i<n;i++)
   ages[i]=S.nextInt();
    for(int i=0;i<n;i++)
     System.out.println(ages[i]+" ");
}
}