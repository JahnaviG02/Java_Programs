import java.util.Scanner;

 class B
{
	public static void main(String args[])
	{
      Scanner S =new Scanner(System.in);
      char ch=S.nextLine().charAt(0);
      switch(ch)
       {
        case 'a':
         case 'e':
         case 'i':
          case 'o':
          case 'u':
                System.out.println("vowel");
                break;
           default:
                 System.out.println("consonant");
                 break;
        }
         S.close();

        


   }
}
