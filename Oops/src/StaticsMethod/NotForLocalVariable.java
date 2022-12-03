package StaticsMethod;

public class NotForLocalVariable {
   static int a=10;
    public static void main(String[] args) {
        //static int b=10; we can not use for local variable
        System.out.println(a);
    }
}
