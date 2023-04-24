//spiral matrix
import java.util.Scanner;
class A
{
 public static void printSpiralForm(int[][] arr,int r,int c){
   int t=0,d=row-1,l=0,row=c-1,dir=0;
   while(t<=d && i<=r)
   {
     if(dir==0)
     {
         for(int i=1;i<=r;i++)
           System.out.println(arr[t][i]+" ");
          t+=1;
     }
     else if(dir==1)
     {
       for(int i=t;i<=d;i++)
          System.out.println(arr[i][r]+" ");
       r-=1;
     }
     else if(dir==2)
     {
       for(int i=r;i>=l;i--)
          System.out.println(arr[d][i]+" ")
       d--;
     }
     else if(dir==3)
     {
       for(int i=d;i>=t;i--)
          System.out.println(arr[i][l]+" ");
       l++;
     }
     d=(d+1)%4;
   }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int arr[][]=new int[rows][cols];
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
      {
        arr[i][j]=sc.nextInt();
      }
     }
   printSpiralForm(arr,rows,cols)
    

  }