import java.util.Scanner;
import java.lang.Math;
class Area
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
         int a=S.nextInt();
         int b=S.nextInt();
         int c=S.nextInt();
         double s=(a+b+c)/2;
         double area=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
         System.out.printf("%.2f",area);
         
    }
}