public class InsertionSort {
    public static void main(String[] args) {
        int [] a={11,2,-3,4,5,44,0,1};
        for (int i=1; i<a.length; i++)
        {
            int temp=a[i];
            int j=i-1;
            for (; j>=0; j--)
            {
                if (j>=0 && a[j]>temp)
                    a[j+1]=a[j];
                else
                    break;
            }
            a[j+1]=temp;
        }
        for (int ele: a)
        {
            System.out.print(ele + " ");
        }
    }
}
