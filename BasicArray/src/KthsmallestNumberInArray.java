import java.util.Scanner;

public class KthsmallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] a = {1,2,3,4,5,6,7,8,9};
        int temp = 0;
        if (k< a.length)
        {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.println(a[k]);
        }
        else {
            System.out.println(" out of rang =" + k);
        }
    }
}
