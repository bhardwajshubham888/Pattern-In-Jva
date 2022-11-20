import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" User Enter your desired number to create a pattern ");
        int n= sc.nextInt();
        for (int i=n; i>=1; i--)
        {
            for (int j=n; j>=1; j--)
            {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
