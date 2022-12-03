// THIS IS CASE OF NON - PRIMITIVE DATA TYPE CALL BY VALUE

class  nonPrimitiveData
{
    int change;
}

// THIS IS CASE OF PRIMITIVE DATA TYPE EXAMPLE THE JAVA IS A CALL BY VALUE NOT A CALL BY REFFRENCE
public class PassByValue {
    public static void swap(int a, int b)
    {
       int temp=a;
       a=b;
       b=temp;
       System.out.println(" in the swap function their value will be changed ");
       System.out.println("a=" + a + " b=" + b);
    }
    public static void main(String[] args) {
int a=10;
int b=2;
        System.out.println(" in the MAIN function their value will NOT be changed ");
        System.out.println("a=" + a + " b=" + b);
        swap(a,b);

        //*************************************************************************************************************
        nonPrimitiveData number1=new nonPrimitiveData();
        nonPrimitiveData number2=new nonPrimitiveData();
        number1.change=50;
        number2.change=100;
        System.out.println(" this is the main function by NON PRIMITIVE DATA TYPE");
        System.out.println(" number1=" + number1.change + " number2=" + number2.change);
        swapNonPrimitiveData(number1,number2);

    }

    // THIS IS CASE OF NON - PRIMITIVE DATA TYPE CALL BY VALUE ========================================================
    public static void swapNonPrimitiveData(nonPrimitiveData a, nonPrimitiveData b)
    {
        nonPrimitiveData temp=a;
        a=b;
        b=temp;
        System.out.println(" this is the NOT MAIN FUNCTION NON PRIMITIVE DATA TYPE");
        System.out.println(" a=" + a.change + " b=" + b.change);
    }

}
