import java.util.Scanner;

public class SourabSuklaStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" now x pattern will print inter input ");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            if (i == (n+1-n) || (i==n)) {
                for (int j = 1; j <= n; j++) {

                    System.out.print("*");
                }
            }
            else
            {
                for (int j=1; j<=n; j++)
                {
                    if ((j==n+1-i))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
