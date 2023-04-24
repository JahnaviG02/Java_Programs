public class PrefixSumDemo{
 public static void main(String  args[])
 {
   //TODO Auto-generated method stub
   int x[]={10,20,23,43,2,2,4,67};
   int pref[]=new int[x.length];
   int suff[]=new int[x.length];
   pref[0]=x[0];
   for(int i=1;i<x.length;i++)
   {
     pref[i]=pref[i-1]+x[i];
   }
 }
}