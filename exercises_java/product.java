import java.util.Scanner;
class P
{
 
  public static void main(String args[])
  {
  Scanner S=new Scanner(System.in);
  int prod=1;
  int n=S.nextInt();  
  for(int i=1;i<=n;i++)
   {
     prod=prod*i;
    }
    System.out.println(prod);
  }
}