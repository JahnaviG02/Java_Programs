import java.util.Scanner;
class N{
 public static void main(String args[])
  {
   Scanner S=new Scanner(System.in);
    double sum=0;
    int n=S.nextInt();
      int x=S.nextInt();
    for(int i=0;i<n;i++)
     {
       sum=sum+1/Math.pow(x,i);
      }
     System.out.println(sum);
   }
}