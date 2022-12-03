package Inheritence;

class A{
    public static void methodA()
    {
        System.out.println("this is a class A method also know as a SINGLE LEVEL Inheritence in java\n ");
        System.out.println(" class A will acces by its own method\n");
    }
}

class BasicAboutInheritence extends A {

public static void insidemainMethod()
{
    System.out.println(" this is inside main method class A method and property and its own method acces by its property\n");
}

    public static void main(String[] args) {
     // Throught A CLASS WE ARE UNABLE TO ACCESS THE MAIN CLASS METHOD

        A obj1=new A();
        A. methodA();

        BasicAboutInheritence obj2=new BasicAboutInheritence();
        obj2.methodA();
        obj2.insidemainMethod();
    }
}
