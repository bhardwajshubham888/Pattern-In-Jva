public class BubbleSort {
    public static void main(String[] args) {
        int [] a={12,3,-3,4,5,44,0,1};
        for (int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

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
