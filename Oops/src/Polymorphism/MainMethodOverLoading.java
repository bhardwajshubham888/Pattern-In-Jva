package Polymorphism;
// CAN WE OVERLOAD JAVA MAIN METHOD-- ANS IS YES LETS SEE
 class MainMethodOverLoading
{
     public static void main(int a)

     {
         System.out.println(" this is a copy of main method ");
     }
     public static void main(String[] args)
     {
        MainMethodOverLoading obj=new MainMethodOverLoading();
        obj.main(100);
        System.out.println(" this is main method");

    }
}
