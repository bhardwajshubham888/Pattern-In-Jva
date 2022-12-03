package CharQuestion;

import java.util.Scanner;

public class PrintCharValueByUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" user enter the full name in char array user input");
        char [] name=sc.next().toCharArray();
        for (int i=0; i<name.length; i++ ) {
            int a=(int) (name[i]);
            System.out.print(name[i]+"="+a);
        }
    }
}
