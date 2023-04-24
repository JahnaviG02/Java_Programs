import java.util.Scanner;
import java.lang.Math;
class D{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int N=S.nextInt();
        int rem,s=0,temp,res,sum=0,i=0;
        temp=N;
        while(N>0)
        {
            rem=N%10;
            s=s*10+rem;
            N=N/10;
        }
        while(s>0)
        {
         res=s%10;
         i++;
         sum=sum+(int)Math.pow(res,i);
         s=s/10;
        }
        if(sum==temp)
          System.out.println("True");
        else
          System.out.println("False");
    }
}
