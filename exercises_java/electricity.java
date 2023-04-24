import java.util.Scanner;
class Electricity
{
 public static void main(String args[])
  {
   Scanner S=new Scanner(System.in);
   int x=S.nextInt();
   if(x<=50)
    {
    double amt= x*(0.50);
    double sur_ch=(20/100)*(amt);
    double tot=amt*sur_ch;
    System.out.println(tot);
    }  
    else if(x>50&& x<=150)
    {
    double amt= x*(0.75);
    double sur_ch=(20/100)*amt;
    double tot=amt*sur_ch;
    System.out.println(tot);
    }
    else if(x>150 && x<=250)
    {
    double amt= x*(1.20);
    double sur_ch=(20/100)*amt;
    double tot=amt*sur_ch;
    System.out.println(tot);
    }  
     else if(x>250)
    {
    double amt= x*(1.50);
    double sur_ch=(20/100)*amt;
    double tot=amt*sur_ch;
    System.out.println(tot);
    }  
 }
}
    