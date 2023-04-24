import java.util.*;
class AN
{
  public static void main(String args[])
  {
  Scanner S=new Scanner(System.in);
    System.out.println("ENTER N:");
   int n=S.nextInt();
  
   int tot=0,rem=0,temp;
   temp=n
  
   while(n>0)//for(n!=0;n=n/10)
   {
    rem=n%10;
    tot=tot+rem*rem*rem;
    n=n/10;
    } 
    if(temp==n)
   { 
    System.out.println("amstrong number);
    }
    else
    System.out.println(" not amstrong number);
  }
 }  