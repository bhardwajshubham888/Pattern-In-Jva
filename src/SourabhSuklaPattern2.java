import java.util.Scanner;

public class SourabhSuklaPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" now x pattern will print inter input ");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            if (i<(n+1)/2)
            {
                for (int j = 1; j <= n+1; j++)
                {
                    if ((i == 1) && (j > i && j < (n+1)/2) || ((j > (n+1)/2) && j < (n+1)))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        if ((i == 2) && (j == i - 1) || (j==(n+1)/2) || (j == n + 1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            }
            else
            {
                for (int k=1; k<=n; k++)
                {
                    if ((k==i-2)||(k==n-i+3))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
