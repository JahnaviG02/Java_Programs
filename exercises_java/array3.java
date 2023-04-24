import java.util.Scanner;
class A{
    public static void main(String args[])
    {
        int i,j,temp=0;
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=S.nextInt();
        for(i=0;i<n;i++)
        {
         for(j=i+1;j<n;j++)
          {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
        }
       System.out.println(arr[i]);  
    }
}