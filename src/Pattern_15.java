import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" User Enter your desired number to create a pattern ");
        int n= sc.nextInt();
        int m=0;
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            m=m+1;
            for (int j=1; j<=n-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
