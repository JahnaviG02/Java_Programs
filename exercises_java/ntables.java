import java.util.Scanner;
class A{
 public static void main(String args[])
 {
 Scanner S=new Scanner(System.in);
 int i,j,k;
  int r=S.nextInt();
  int n=S.nextInt();
 for(i=1;i<=r;i++)
 {
  for(j=1;j<=r;j++)
   {
     for(k=1;k<=r;k++)
       {
         int a=n*i;
        int b=n+1*j;
         int c= n+2*k;
      System.out.println(a+" "+b+" "+c+" " );
       }
     
    }
} 

 }
}
