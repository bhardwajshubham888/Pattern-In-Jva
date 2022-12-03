public class MergeSort {
    public static void main(String[] args) {
        int [] a={2,9,-3,7,-1,8,6,0};
        int length=a.length;
        divide(a,0,length-1);
        for (int ele: a)
        {
            System.out.print(" " + ele);
        }
    }
    public static void divide(int [] a , int low , int high){
        if (low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        divide(a,low,mid);
        divide(a,mid+1,high);
        mergesort(a,low,high,mid);
    }
    public static void mergesort(int [] a, int low , int high, int mid)
    {
        int i=low;
        int j=mid+1;
        int k=0;
        int []b=new int[high-low+1];
        while (i<=mid&&j<=high)
        {
            if (a[i]<=a[j])
            {
                b[k]=a[i];
                k++;
                i++;
            }
            else {
                b[k]=a[j];
                k++;
                j++;
            }
        }
        while (i<=mid)
        {
            b[k]=a[i];
            k++;
            i++;
        }
        while (j<=high)
        {
            b[k]=a[j];
            k++;
            j++;
        }
        for (int l=0,m=low; l<b.length; l++,m++)
        {
            a[m]=b[l];
        }

    }
}