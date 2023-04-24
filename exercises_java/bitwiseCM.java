import java.util.Scanner;
class A{
    public static void main(String args[])
    {
        int sum=0;
        Scanner S=new Scanner(System.in);
        int T=S.nextInt();
        int N=S.nextInt();
        int A=S.nextInt();
        int sum=N+A;
        while(T-->0)
         if(sum& 1>0) 
         {
             System.out.println("Odd");
         }
         else if(sum & 1 ==0)
          {
              System.out.println("Even");
          }
          else
             System.out.println("Impossible");
        }
    }
}