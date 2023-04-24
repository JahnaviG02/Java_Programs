import java.util.*;
class AN
{
  public static int amstrong(int n)
   {

   int tot=0,rem=0,temp;
   temp=n;
  
   while(n>0)
   {
    rem=n%10;
    tot=tot+rem*rem*rem;
    n=n/10;
    } 
    if(temp==tot)
     { 
     return True;
     }
    else
     return False;
  }
  public static void main(String args[])
  {
  Scanner S=new Scanner(System.in);
   
   int n=S.nextInt();
   if(amstrong(n))
     System.out.println(n+"amstromg number");
   else
    System.out.println(n+" not amstromg number");
   }
}