import java.util.Scanner;
class  L{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int temp,rem1,rem3,rem5,rem7;
        int rem2=0,rem4=0,rem6=0,rem8=0;
        int N=S.nextInt();
        temp=N;
        while(N>0)
        {
         rem1=N%10;
         rem2=rem1;
         N=N/10;
         
         rem3=N%10;
         rem4=rem3;
         N=N/10;
         
         rem5=N%10;
         rem6=rem5;
         N=N/10;
         
         rem7=N%10;
         rem8=rem7;
         N=N/10;
         
        }
    if(rem2>rem4)
    {
         if(rem2>rem6)
         {
             if(rem2>rem8)
             {
                 System.out.println(rem2);
             }
             else
             {
                 System.out.println(rem8);
             }
         }
         else
         {
             if(rem6>rem8)
             {
                 System.out.println(rem6);
             }
             else
             {
                 System.out.println(rem8);
             }
         }
    }
         else
         {
             if(rem4>rem6)
             {
                 if(rem4>rem8)
                 {
                     System.out.println(rem4);
                 }
                 else
                 {
                     System.out.println(rem8);
                 }
             }
             else
             {
                 if(rem6>rem8)
                 {
                     System.out.println(rem6);
                 }
                 else
                 {
                     System.out.println(rem8);
                 }
             }
         }  
    }
}