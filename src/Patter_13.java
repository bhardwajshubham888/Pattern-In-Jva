import java.util.Scanner;

public class Patter_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" User Enter your desired number to create a pattern ");
        int n= sc.nextInt();
        int m=4;
        int k=4;
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n+3; j++)
            {
                if (j>=k && j<=m) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            m=m+1;
            k=k-1;
        }
    }
}
