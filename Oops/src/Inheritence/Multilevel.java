package Inheritence;
class B{
    public static void aClassMethod()
    {
        System.out.println("this is class class a method\n");
    }
}

class C extends B
{
    public static void bClassMETHOD(){
        System.out.println(" this is class b method\n");
    }
}

public class Multilevel extends C {

    public static void mianMethodClass()
    {
        System.out.println(" THIS IS THE INSIDE MAIN CLASS METHOD");
    }


    public static void main(String[] args) {
        B OBJ1=new B();
        OBJ1. aClassMethod();


        C OBJ2=new C();
        OBJ2.aClassMethod();
        OBJ2.bClassMETHOD();

        Multilevel OBJ3=new Multilevel();
        OBJ3.aClassMethod();
        OBJ2.bClassMETHOD();
        OBJ3.mianMethodClass();

    }
}
