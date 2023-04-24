import java.util.Scanner;
class E
  {
    public static void main(String args[])
      {
        Scanner S=new Scanner(System.in);
        int basic_salary =S.nextInt();
         if(basic_salary<=10000)
          {
            double hra=(basic_salary)*(0.2); 
            double da=(basic_salary)*(0.8);
            double gross_salary=(basic_salary+ hra+da);
            System.out.println(gross_salary);
           }
          else if (basic_salary<=20000)
           {
             double hra=(basic_salary)*(0.25);
             double da=(basic_salary)*(0.9);
             double gross_salary=(basic_salary+ hra+da);
             System.out.println(gross_salary);
            }
          else
            {
             double hra=(basic_salary)*(0.3);
             double da=(basic_salary)*(0.95);
             double gross_salary=(basic_salary+ hra+da);
             System.out.println(gross_salary);
            }
          
         }
}