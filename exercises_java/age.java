import java.util.Scanner;
class Age
{
	public static void main(String args[])
	{
      Scanner S =new Scanner(System.in);
      int age=S.nextInt();
      if(age>=18)
    	System.out.println("eligible");
      else
    	 System.out.println("not eligible");
      S.close();

   }
}