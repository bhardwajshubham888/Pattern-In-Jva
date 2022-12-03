package Polymorphism;
/* 1-- this is also knows as a run time polymorphism that will be gain by METHOD OVERRIDING ITS IS HANDEL BY (JVM) JAVA VIRTUAL MACHINE
   2--FUNCTION NAME SHOULD BE SAME AND argument should be SAME
   3--THIS  SHOULD BE IN DIFFERENT CLASS JIS CLASS KE OBJ SE ACCESS KAROGE USI CLASS KA METHOD CALL HOGA KU KI METHOD AND ARGUMENT SAME HONGE
   4--ONE MORE IDENTIFICATION IS   class will bw inherit by other class
 */
class guest1{
    public static void sameFunction(int a, int b)
    {
        System.out.println(" this is the first class also know as parent class");
        System.out.println("a+b="+(a+b));
    }
}

public class MethodOverriding extends guest1
{
    public static void sameFunction(int a, int b)
    {
        System.out.println(" this is the first class also know as parent class");
        System.out.println("a+b="+(a+b));
    }

    public static void main(String[] args)
    {
        guest1 obj1=new guest1();
        obj1.sameFunction(20,20);

    MethodOverriding obj2=new MethodOverriding();
    obj1.sameFunction(50,50);
    }
}
