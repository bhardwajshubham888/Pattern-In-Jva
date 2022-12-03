class change
{
    int number1;
}
//
public class PassByReffrence
{
    public static void main(String[] args) {
    change value1=new change();
    value1.number1=100;
    changeMethod(value1);
    System.out.println(" IN of main method number1= " + value1.number1);
    }
    public static void changeMethod( change value1)
    {
     value1.number1=50;
     System.out.println(" out of main method number1= " + value1.number1);
    }
}
