class shuham{
    String name;
    shuham() {            // isko hi hum non-pera constructor kehte hai (no value)
        name="shubham";  // yaha hum constructor banane ke sath defined bhi kar sakte hai jab value hame pata ho ki fixed hone wali hai atb ese defined karna warna nahi
    }
}


public class ConstructorInMethod {
    public static void main(String[] args) {
        shuham firstname=new shuham();
        System.out.println(firstname.name);  // value upper hi de diya mene
    }
}









/*
1==============================================================================================================================================
class shubham {
    String name;
    shubham() {
        System.out.println(" shubham constructor is  calling ");
    }
}


public class ConstructorInMethod {
    ConstructorInMethod() {
        System.out.println(" object is calling ");                // AGR MAIN METHOD MAI OBJ NA BANAYE TAB BHI CONSTRUCTOR CALL HOGA
    }

         public static void main(String[] args) {
         ConstructorInMethod obj=new ConstructorInMethod();       // when we defined obj constructor automatic call ho


        //****************************************************************************************************************************
        shubham first =new shubham();
        System.out.println("first name=" + first.name);         /// yaha null print hoga ku ki value defined nahi ki hai constructor null kar dega jab ye object banega

        shubham second=new shubham();
        second.name="sharma";
        System.out.println(" second name=" + second.name);      // yaha sharma print hoga ku ki name ko object ke throught defined kiya hai
    }

}
**/
