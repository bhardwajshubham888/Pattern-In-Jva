/* 1-- class should be same
   2-- function name should be same and argument should be different
   3--this is knows as a static or compile time polymorphism. and  it is handel by compiler and achieve by method overloading
   4-- THIS SHOULD BE IN SAME METHOD
 */
package Polymorphism;

 class MethodOverLoading {
     public static void sameFunction(String name, int age)
     {
         System.out.println("the name is="+ name +" and age is " +age );
     }
     public static void sameFunction(int age, String name)
     {
         System.out.println("the name is="+ name +" and age is " +age );
     }
     public static void add(int a, int b)
     {
         System.out.println("a+b="+ (a+b));
     }
     public static void add(float a, float b)
     {
         System.out.println("a+b= "+(a+b));

     }
     public static int addThreeNumber(int a , int b, int c)
     {
         int sum=(a+b+c);
         System.out.println(sum);
         return sum;
     }
     public static float addThreeNumber(float a , float b, float c)
     {
         float sum=(a+b+c);
         System.out.println(sum);
         return sum;

     }

    public static void main(String[] args) {
         sameFunction("shubham",24);
         sameFunction(29,"suraj");
         add(20,20);
         add(20.5f,30.44f);
         addThreeNumber(20,20,20);
         addThreeNumber(30.f,40.f,70.f);
    }
}
