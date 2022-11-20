import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        System.out.println(" User Enter your desired number to create a pattern ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                System.out.print(" " +ch);
            }
             ch=(char)(ch+i);
            System.out.println();
        }
    }
}
