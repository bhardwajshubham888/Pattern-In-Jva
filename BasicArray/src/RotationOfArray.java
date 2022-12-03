import java.util.Scanner;

public class RotationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" user tell me rotation of cycle");
        int k = sc.nextInt();
        System.out.println("a={1,2,3,4,5,6};");
        int[] a = {1, 2, 3, 4, 5, 6};
        int [] temp=new int[a.length];
        for (int i = 0; i < a.length; i++)
        {
            temp[(k+i)%a.length]=a[i];
        }

            for (int ele : temp)
            {
                System.out.print(ele + " ");
            }
            System.out.println();


    }
}
