import java.util.Scanner;
class P{
    public static boolean isCountpalindrome(int N) 
    {
        int temp=0,rem,sum=0;
         for(int i=0;i<N;i++)
         {
             temp=arr[i];
             while(temp!=0)
             {
               rem=temp%10;
               sum=sum*10+rem;
               temp=temp/10;
             }
         }
             if(sum==temp)
             {
                return true; 
             }
             else
                return false;
    }
    public static void main(String args[])
    {
        int count=0;
        Scanner S=new Scanner(System.in);
         int N=S.nextInt();
         int arr[]=new int[N];
        for(int i=0;i<N;i++)
        arr[i]=S.nextInt();
        if(isCountpalindrome(N))
        {
            count++;
        }
    System.out.println(count);
    }
}