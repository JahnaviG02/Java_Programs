import java.util.Scanner;
class Colors
{
 public static void main(String args[])
 {
 
  Scanner S=new Scanner(System.in);
  char ch = S.nextLine().charAt(0);
    switch(ch)
    {
     case 'v':
          System.out.println("voilet");
          break;
      case 'i':
          System.out.println("indigo");
          break;
      case 'b':
          System.out.println("blue");
          break;
      case 'G':
          System.out.println("green");
          break;
       case 'Y':
          System.out.println("yellow");
          break;
       case 'O':
          System.out.println("orange");
          break;
       case 'R':
          System.out.println("red");
          break;
       default:
          System.out.println("enter valid color");
          break;
     }

    }
}