import java.util.Scanner;
class A{
  public static void main(String args[])
  {
  Scanner S=new Scanner(System.in);
   int min=0;
  int N=S.nextInt();
  int arr[]=new int[N];
  for(int i=0;i<N;i++)
  arr[i]=S.nextInt();
  for(i=0;i<N;i++)
  {
   min=arr[i];
   for(i=1;i<N;i++)
   {
    if(arr[i]<min);
     {
      min=arr[i];
     }
   }

}
  