import java.util.*;
class Sample
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n,i,x[];
     n=sc.nextInt();
     x=new int[n];

     for(i=0;i<n;i++)
       x[i]=sc.nextInt();
     HashMap<Integer,Integer> hm=new HashMap<>();

     for(i=0;i<n;i++)
      {
          if(hm.containsKey(x[i]))
               hm.put(x[i],hm.get(x[i])+1);
          else
               hm.put(x[i],1);
      }

     for(Map.Entry pair:hm.entrySet()){  
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
     System.out.println("Unique elements");
      for(Map.Entry pair:hm.entrySet()){  
        if((int)pair.getValue()==1)
            System.out.println(pair.getKey());
        }
  }
}