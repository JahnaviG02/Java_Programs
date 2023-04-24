import java.util.*;
class Ens
  {
    public static void main(String args[])
      {
        Scanner S=new Scanner(System.in);
        System.out.println("enter basic salary:");
        int bsalary=S.nextInt();
        System.out.println("enter hra:");
        int hra=S.nextInt();
        System.out.println("enter da:");
        int da=S.nextInt();
        System.out.println("enter tax:");
        int tax=S.nextInt();
        float NP=(bsalary+hra+da-tax);
        System.out.println("Net Salary:"+NP);
        }
    }
