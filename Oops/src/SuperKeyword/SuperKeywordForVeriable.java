package SuperKeyword;

class A{
    int a=2;
}

class B extends A{
    int a=1;
    public void printValue(int a)
    {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

public class SuperKeywordForVeriable {
    public static void main(String[] args) {
        B OBJ=new B();
        OBJ.printValue(100);
    }
}
