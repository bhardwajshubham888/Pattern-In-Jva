import java.util.Scanner;
// this is apply on monotonic function
public class BinarySearch {
    public static void main(String[] args) {
        int [] a={-4};
        int key=0;
        binarySearch(a,key);

    }
    public static void binarySearch(int [] array, int key)
    {
        int start=0;
        int end= array.length-1;
        int mid=(start+end)/2;
        while (start<=end)
        {
            if (array[mid]==key)
            {
                System.out.println("key="+key);
                break;
            }
            else if (array[mid]<key)
            {
            start=mid+1;
            }
            else
            {
                end=mid-1;
            }
             mid=(start+end)/2;
        }
        if (start>end)
        {
            System.out.println("key is not present");
        }
    }
}
