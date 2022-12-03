package SuperKeyword;
class first
{
    public  void method()
    {
        System.out.println(" this is class  first");
    }
}
class second extends first
{
    public  void method()
    {
        super.method();
        System.out.println(" this is class B");
    }
}

public class SuperKeyForMethod
{
    public static void main(String[] args)
    {
    second obj=new second();
    obj.method();
    }
}
