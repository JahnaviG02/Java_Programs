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
 public static void main(String args[])
 {
 Scanner S=new Scanner(System.in);
 int n=S.nextInt();
  System.out.println(isPalindrome(n));
  
 }
}