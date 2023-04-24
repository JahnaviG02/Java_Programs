import java.util.Scanner;
class P
{
 public static boolean isPalindrome(int n)
 {
  int d=(int)Math.log10(n);
   int flag=0;
  while(n>9)
   {
    if(n/(int)Math.pow(10,d)!=n%10)
     {
      flag=1;
      break;
     }
   n=n%(int)Math.pow(10,d);
  n=n/10;
  d=d-2;
   }
  if(flag==1)
    return false;
  else
    return true;
}
public static boolean isPrime(int n)
{
 for(int i=2;i<=(int)Math.sqrt(n);i++);
 {
   if(n%i==0)
    {
     return false;
    }
   }
  return true; 
}
 public static void main(String args[])
 {
 Scanner S=new Scanner(System.in);
 int n=S.nextInt();
 n=Math.abs(n);
 if(n%2==0)
  n=n+1;
 else
  n=n+2;
for(int i=2;i<=n+1;i++)
  {
   if(isPalindrome(n)&& isPrime(n))
   {
    System.out.println(i);
   }
 }
 }
}