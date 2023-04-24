import java.util.Scanner;
class C
 {
  public static void main(String args[])
  {
   Scanner S =new Scanner (System.in);
   int a=S.nextInt();
   int b=S.nextInt();
   int c=S.nextInt();
   if(a==b&& b==c ) 
     System.out.println("equal");
   else if(a==b || b==c || a==c )
     System.out.println("isoceles");
    else
     System.out.println("scalen");
}
}