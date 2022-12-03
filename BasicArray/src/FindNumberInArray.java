import java.util.Scanner;

    public class FindNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" user enter the number");
        int number = sc.nextInt();
        System.out.println(" enter the length of array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int i;
        System.out.println(" user enter the value");
        for (i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {

                if (arr[i] + arr[j] == number) {
                    // System.out.println("number="+number);
                    count = count + 1;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("number is not present");
        }
        else
        {
            System.out.println("number=" + number);
        }
    }
}
