package StaticsMethod;
class test{
    static int a=10;
}
public class CallThroughtTestClass {
    public static void main(String[] args) {
        System.out.println(test.a);// statics variable can be access by class
    }
}
