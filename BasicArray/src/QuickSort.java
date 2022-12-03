public class QuickSort {
    public static void main(String[] args) {

      int []a={17,34,55,7,8,266,2,6};
      int length=a.length;
      quickSort(a, 0, length-1);
      for (int ele: a)
      {
          System.out.print(" "+ ele);
      }
}
public static int partition(int [] a, int low , int high){
        int pi=a[low];
        while (low<=high)
        {
            while (a[low]<pi){
                low++;
            }
            while (a[high]>pi)
            {
                high--;
            }
            if (low<=high)
            {
                int temp=a[low];
                a[low]=a[high];
                a[high]=temp;
                low++;
                high--;
            }

        }
        return low;
}
public static void quickSort(int [] a ,int low, int high)
{
    int pi=partition(a,low,high);
    if (low<pi-1)
    {
        quickSort(a,low,pi-1);
    }
    if (pi<high)
    {
        quickSort(a,pi,high);
    }
}

}
