public class SortingArrayDecendingOrder {
    public static void main(String[] args) {
        int[] a = {11, 2, 3, 8, 10, -2, 8};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
