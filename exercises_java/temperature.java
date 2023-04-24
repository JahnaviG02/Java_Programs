import java.util.Scanner;
class T
{
 public static void main(String args[])
 {
  Scanner S=new Scanner(System.in);
  int temp = S.nextInt();
   if(temp <0)
    System.out.println("freezing weather");
     if(temp >=0 && temp<=10)
    System.out.println("very cold weather");
     if(temp >10 && temp<=20)
    System.out.println("cold weather");
     if(temp >20  && temp<=30)
    System.out.println("normal in temp");
     if(temp >30 && temp<=40)
    System.out.println("its hot");
     if(temp >40)
    System.out.println("its very hot");
 }
}