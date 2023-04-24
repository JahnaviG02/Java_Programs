import java.util.Scanner;
class Heros
{
 public static void main(String args[])
 {
  Scanner S=new Scanner (System.in);
  String hero_name1 =S.nextLine();
  int a=S.nextInt();
  int b=S.nextInt();
  int c=S.nextInt();
  S.nextLine();
  String hero_name2 =S.nextLine();
  int e=S.nextInt();
  int f=S.nextInt();
  int g=S.nextInt();
   int hit_movies1=a*10; 
  int  avg_movies1 =b*5; 
  int  flop_movies1=c*(-5);
  int d=(hit_movies1+avg_movies1+flop_movies1);
 
  int hit_movies2=e*10; 
  int  avg_movies2 =f*5; 
  int  flop_movies2=g*(-5);
  int h=(hit_movies2+avg_movies2+flop_movies2);
  
  if(d>h)
   System.out.println("best hero :" +hero_name1);
  else
    System.out.println("best hero :" +hero_name2);
 }
}