import java.util.*;
class R
{
  public static void main(String args[])
  {
  Scanner S=new Scanner(System.in);
    System.out.println("ENTER N:");
   int n=S.nextInt();
  
   int rev=0,rem=0;
  
   while(n>0)
   {
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
    } 
    System.out.println(rev);
  }
 }  