import java.util.Scanner;
class Sample
{
 public static boolean isAutomorphic(int n)
 {
    int d=(int)Math.log10(n)+1;
    if((n*n)%(int)Math.pow(10,d)==n)
      return true;
    else 
      return false;
 }
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   if(isAutomorphic(n))
     System.out.println(n+" is an Automorphic number");
   else
     System.out.println(n+" is not an Automorphic number");
 }
}