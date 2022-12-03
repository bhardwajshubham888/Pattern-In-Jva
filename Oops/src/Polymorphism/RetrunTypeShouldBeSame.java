package Polymorphism;
class A{
    public static Object sameFunction(String name)
    {
        System.out.println("this is the return type of object and should be return something ");
        return name;
    }
}

public class RetrunTypeShouldBeSame extends A {
    public static String sameFunction(String name) {
        System.out.println(" this is string retun type chilld mai hum esa likh sakte hai but parent ke case mai nahi");
        return name;
    }

    public static void main(String[] args) {
        A OBJ = new A();
        System.out.println(OBJ.sameFunction("shubham"));


        RetrunTypeShouldBeSame obj = new RetrunTypeShouldBeSame();
        System.out.println(obj.sameFunction("sharma"));
    }
}
