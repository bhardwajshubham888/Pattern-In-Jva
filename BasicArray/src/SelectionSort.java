public class SelectionSort {
    public static void main(String[] args) {
        int [] a={11,2,-3,4,5,44,0,1};
        for (int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if (a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
            for (int ele: a)
            {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
