import java.util.Scanner;
class A{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int N=S.nextInt();
        int flag=0,rem,rem1,q;
        q=N*N;
        while(N!=0)
        {
           rem=N%10;
           rem1=q%10;
           if(rem!=rem1)
            flag=1;
           N=N/10;
           q=q/10;
        }
        if(flag==0)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
           System.out.println("Not an Automorphic Number"); 
        }
    }
}