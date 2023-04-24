import java .util.Scanner;
class A
{

  public static boolean isPrime(int n)
  {
    for(int i=2;i<=(int)Math.sqrt(n);i++)
      {
        if(n%i==0)
         return false;
     }
    return true;
   }
 public static void main(String args[])
 {
 Scanner s=new Scanner(System.in);
   int t,i;
   t=s.nextInt();
   while(t-->0)
   {
    int n=s.nextInt();
    int found=0;
    for(i=2;i<=(int)Math.sqrt(n);i++)
     {
      if(n%i==0)
       {
         if(isPrime(i) && isPrime(n/i) && (i!=(n/i)))
         { 
          found=1;
             break;
          }
        }
      }
    
       if(found==1)
        System.out.println("yes");
       else
         System.out.println("no");
    }
    }
}
