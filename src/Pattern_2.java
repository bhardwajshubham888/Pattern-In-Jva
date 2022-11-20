import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" User Enter your desired number to create a pattern ");
        int n= sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
pattern -2-diff method
 for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
            if(j<=n-i)
                System.out.print(" ");
            else
           System.out.print(" ");
           }
            System.out.println();
        }

*/