package Inheritence;

class  classA
{
    public static void firstClass()
    {
        System.out.println(" this is first classA method ");
    }
}

class  classB extends classA
{
    public static void firstSecond()
    {
        System.out.println(" this is first classB method ");
    }
}


// assume this is class C
public class  Hierarical extends classA
{
    public static void mainClass()
    {
        System.out.println(" this is main class");
    }
    public static void main(String[] args)
    {
      classA objA=new classA();
      objA.firstClass();

      Hierarical obj=new Hierarical();
      obj.firstClass();
      obj.mainClass();






    }
}