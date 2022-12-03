import java.util.Scanner;

public class BasicOf_String
{

    }
















/*
 1==========================================================================================
 this is way initialization of String litteral way
        String first="shubham sharma";
        String last="sharma";
        System.out.println(first);
        System.out.println(last);


 2=================================================================================
Scanner sc =new Scanner(System.in);
        String first=sc.next(); this is used for take only one word by user
        System.out.println(first);

3====================================================================================
Scanner sc=new Scanner(System.in);
String fullname=sc.nextLine(); this is used for take for full input by user
        System.out.println(fullname);

4====================================================================================
this is way of  Concatenation in java
        Scanner sc=new Scanner(System.in);
        String firstname=" shubham";
        String space= " ";
        String lastname=" sharma";
        String fullname=firstname+space+lastname;
        System.out.println(fullname);
for (int i=0; i<fullname.length(); i++)
        {
            System.out.print(fullname.charAt(i) + "-");
5=========================================================================================
// this is way add to uppercase and lowercase pre-defined function or method
        String name1="shubham sharma";
        String name2="SHUBHAM SHARMA";
        name1=name1.toUpperCase();
        name2=name2.toLowerCase();
        System.out.println(name1);
        System.out.println(name2);
6================================================================================
// this is way add to find the length of string
        String name1="shubham sharma";
        String name2="SHUBHAM SHARMA";
        int name1_length=name1.length();
        int name2_length=name2.length();
        System.out.println(name1_length);
        System.out.println(name2_length);

 7=========================================================================
 // this is a method to get substring by pre define method in java and index 1 means it,s is given starting index
        String name ="shubham sharma";
        name=name.substring(1);
        System.out.println(name);
             OR
             String name ="shubham sharma";
        name=name.substring(1,9);
        System.out.println(name);
8========================================================================================
  // this is a method to replace one char by pre define method in java
        String name ="shubham sharma";
        name=name.replace('m','k');
        System.out.println(name);
                OR
        String name ="shubham sharma";
        name=name.replace("sh","am");
        System.out.println(name);
9===================================================================================
  // this is way to check reverse the string is empty or not
  StringBuffer name1= new StringBuffer(" shubham sharma");
        System.out.println(name1.reverse());

        StringBuilder name2=new StringBuilder(" suraj sharma");
        System.out.println(name2.reverse());
10===============================================================================
// this is way to check the string is empty or not
String name1= " shubham sharma";
        System.out.println(name1.isEmpty());

        String name2="";
        System.out.println(name2.isEmpty());
11=========================================================================
 String name1= " shubham sharma";
        System.out.println(name1.contains("shubham"));

        String name2="suraj";
        System.out.println(name2.contains("z"));
         */
