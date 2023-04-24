import java.util.Scanner;
class Calc
{
 public static void main(String args[])
  {
   Scanner S=new Scanner(System.in);
   double n1= S.nextDouble();
    double n2= S.nextDouble();
   char operator=S.next().charAt(0);
   switch(operator)
   {
    case '+':
      System.out.println(n1+n2);
      break;
     case '*':
      System.out.println(n1*n2);
      break;
     case '-':
      System.out.println(n1-n2);
      break;
     case '/':
      System.out.println(n1/n2);
      break;
      default:
       System.out.println("invalid");
    }
 }
}