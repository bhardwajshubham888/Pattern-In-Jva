import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        System.out.println(" User Enter your desired number to create a pattern ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for (int i=1; i<=n; i++)
        {
            count=i;
            for (int j=1; j<=i; j++)
            {
                System.out.print(" "+count);
                count=count-1;
            }
            System.out.println();
        }
    }
}
