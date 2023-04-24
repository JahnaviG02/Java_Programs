import java.util.Scanner;
class P
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        
        for(int i=m;i<=n;i++)
        {
             int count=0;
            for(int j=1;j<=i;j++)
            {
                
              if(i%j==0)
               {
                   count=count+1;
               }
            }
         if(count==2)
            System.out.println(i);
         
        }
   
    }
}