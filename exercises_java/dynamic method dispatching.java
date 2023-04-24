// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class X{
    public void m1()
    {
        System.out.println("Aditya");
    }
    public void m2()
    {
        System.out.println("Sri Aditya");
    }
}
class Y extends X
{
     public void m1()
    {
        System.out.println("acet Aditya");
    }
    public void m2()
    {
        System.out.println("Sai Aditya");
    }
}
class DynamicMethod{
    public static void main(String[] args)
    {
        X x =new Y();
        x.m1();
        x.m2();
    }
}