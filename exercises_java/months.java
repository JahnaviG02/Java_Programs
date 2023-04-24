import java.util.Scanner;
class M
{
 public static void main(String args[])
 {
  Scanner S=new Scanner(System.in);
  int n=S.nextInt();
  switch(n)
   {
    case 3:
    case 4:
    case 5:
        System.out.println("summer");
        break;
     case 6:
     case 7:
     case 8:
     case 9:
         System.out.println("rainy");
         break;
     case 10:
     case 11:
     case 12:
     case 1:
     case 2:
          System.out.println("winter");
         break;
     default:
         System.out.println("invalid month");
    }
 }
}
