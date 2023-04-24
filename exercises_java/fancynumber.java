import java.util.*;
public class fancy {
    public static boolean isfancy(long s)
    {
       int n,c=1,d=1,i=1,r,k;
       r=(int)(s%10);
       n=(int)(s/10);
       int arr[] = new int[10];
       arr[r]++;
       while(n>0)
       {
            k=n%10;
            n=n/10;
            if(r==k)
                c++;
            else if(k==r-1)
                d++;
            else if(k==r+1)
                i++;
            else
                c=i=d=1;
            r=k;
            arr[r]++;
            if(c==3 || d==3||i==3)
            {
                return true;
            }
       }
       for(i=0;i<10;i++)
       {
            if(arr[i]>=5)
            {
                return true;
            }
       }
       return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        if(n<(int)Math.pow(10, 9) || n>=Math.pow(10,10))
        System.out.println("-1");
        else if(isfancy(n))
            System.out.println("fancy");
        else
            System.out.println("not");
    }
}
