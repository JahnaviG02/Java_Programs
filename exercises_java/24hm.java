import java.util.*;
class Sample
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n,i,x[],tar;
     n=sc.nextInt();
     x=new int[n];

     for(i=0;i<n;i++)
       x[i]=sc.nextInt();
        
     tar=sc.nextInt();
     for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
          {
             if(x[i]+x[j]==target && i!=j)
              {
                found=1;
                 break;
     
              }
        }
     }
     if(found==1)
       {
         System.out.println("yes");

       }
     else
            System.out.println("no");
  }
}