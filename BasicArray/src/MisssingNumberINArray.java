public class MisssingNumberINArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int sum1 = 0;
        int sum2 = 0;
        System.out.print(" length of array is =" + a.length);
    for (int i = 0; i < a.length; i++) {

        sum1 = sum1 + a[i];
    }

    for (int i = 1; i <= a.length + 1; i++) {
        sum2 = sum2 + i;
    }
    int ans = sum2 - sum1;
    System.out.print(" missing number is =");
    System.out.print(ans);

    }
}
