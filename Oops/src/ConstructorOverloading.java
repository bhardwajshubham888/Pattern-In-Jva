import java.util.Scanner;

class vehicle
{
    String name;
    int wheel;
    float mileage;


// THIS IS CONSTRUCTOR OVERLOADING MEANS WHEN WE WILL PASS DIFFRENT ARUGMENT WITH SAME CONSTRUCTOR NAME THIS IS CALL CONSTRUCTOR OVERLOADING SAME ARUGMENT NAHI PASS KAR SAKTE
    vehicle( float mileage , int noofwheel )
    {
        System.out.println(" the car mileage is " + mileage  + "no od wheel is " + noofwheel);
    }
    vehicle(String name, int  noofwheel)
    {
        System.out.println(" the scooty name  is " + name  + "no of wheel is " + noofwheel);
    }

}
public class ConstructorOverloading {
    public static void main(String[] args) {
         vehicle shaz=new vehicle(12.88f,4);
        vehicle razia=new vehicle(" honda",4);

    }
}
