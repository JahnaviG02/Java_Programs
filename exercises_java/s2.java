import java.util.Scanner;
class S
{
  public static void main(String args[])
  {
  double sum=0;
  Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int x=S.nextInt();
  if(x==0){
    System.out.println("-1");
    
  }
  else
   {
   for(int i=1;i<=n;i++)
   {
    sum=sum+1/Math.pow(x,i);
    }
    System.out.println(sum);
   }
  }
}