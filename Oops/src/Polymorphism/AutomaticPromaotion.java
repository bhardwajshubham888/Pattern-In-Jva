package Polymorphism;
//Java Automatically Promotes data will be Convert like char convert into int
public class AutomaticPromaotion {
    public static void sameFunction(int a)
    {
        System.out.println(" this is a automatic promotion char will bw convert into int " + a);
    }
    public static void main(String[] args)
    {
        AutomaticPromaotion obj=new AutomaticPromaotion();
        obj.sameFunction('a');
        System.out.println(" main method");
    }
}
