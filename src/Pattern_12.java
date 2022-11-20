import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" User Enter your desired number to create a pattern ");
        int n= sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            for (int j=n; j>=i; j--)
            {
                System.out.print(j);
            }
            for (int k=1; k<i; k++)
            {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
