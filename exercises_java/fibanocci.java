import java.util.Scanner;
class Fibonacci
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    int temp=0;
    int n1=0;
    int n2=1;
    for(int i=0;i<n;i++)
    {
        System.out.print(n1+" ");
        temp=n1+n2;
        n1=n2;
        n2=temp;
        
        
    }
    
   
  
  }
}