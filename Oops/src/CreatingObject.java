 // THIS IS WAY OBJECT INTILIZATION BY construtor
 class CreatingObject{
    String name;
    int age;
    String gender;
    CreatingObject(String name,int age, String gender)
     {
         this.name=name;
         this.age=age;
         this.gender=gender;
         System.out.println(this.name+" "+this.age+" "+ this.gender);
     }
     public static void main(String[] args) {
         CreatingObject shubham= new CreatingObject("shubham ",10,"male");
         CreatingObject suraj= new CreatingObject("suraj",28,"male");
         CreatingObject mala= new CreatingObject("male",58,"female");
     }
 }









/*
 this is call OBJECT INTILIZATION BY REFRENCE VERIABLE

class guest1{
    String name;
    int age;
    String gender;
}


public class CreatingObject {
    public static void main(String[] args) {
        guest1 atul=new guest1();
        atul.name="atul bharwaj";
        atul.age=21;
        atul.gender="male";
        System.out.println(atul.name);
        System.out.println(atul.gender);
        System.out.println(atul.age);
        guest2 suraj=new guest2();
        suraj.name="atul bharwaj";
        suraj.age=21;
        suraj.gender="male";
        System.out.println(suraj.name);
        System.out.println(suraj.gender);
        System.out.println(suraj.age);
        guest3 manish=new guest3();
        manish.name="atul bharwaj";
        manish.age=21;
        manish.gender="male";
        System.out.println(manish.name);
        System.out.println(manish.gender);
        System.out.println(manish.age);
    }
}

class guest2{
    String name;
    int age;
    String gender;
}

class guest3{
    String name;
    int age;
    String gender;
}
=========================================================================================================================
// THIS IS WAY OBJECT INTILIZATION BY OBJECT
class guest{
    String name;
    int age;
    String gender;

    public void information( String name, int age, String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        System.out.println(name +" "+ age+" "+gender);
    }

}
public class CreatingObject {
    public static void main(String[] args) {
        guest atul=new guest();
        atul.information(" atul",21,"male");
        guest manish=new guest();
        manish.information("manish",19,"male");
        guest suraj=new guest();
        suraj.information(" suraj",28,"male");

        // thoda sa kaam ghat gaya bas



    }

}
=============================================================================================================================
// THIS IS WAY OBJECT INTILIZATION BY construtor
 class CreatingObject{
    String name;
    int age;
    String gender;
    CreatingObject(String name,int age, String gender)
     {
         this.name=name;
         this.age=age;
         this.gender=gender;
         System.out.println(this.name+" "+this.age+" "+ this.gender);
     }
     public static void main(String[] args) {
         CreatingObject shubham= new CreatingObject("shubham ",10,"male");
         CreatingObject suraj= new CreatingObject("suraj",28,"male");
         CreatingObject mala= new CreatingObject("male",58,"female");
     }
 }


*/
