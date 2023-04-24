import java.util.Scanner;
import java.lang.Math;
class Qudratic
{
  public static void main(String args[])
  {
    double a, b, c;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
   
    double desc =Math.sqrt((b*b)-(4*a*c));

      if(d>0){
          double firstRoot = (-b + desc)/(2*a);
          double secondRoot = (-b - desc)/(2*a);
         System.out.println("Roots are : "+ firstRoot +" and "+secondRoot);
      } 
      else if(d == 0){
         System.out.println("Root is : "+(-b + desc)/(2*a));
       
      }
     else
      System.out.println("Roots are imaginary");
   }
}