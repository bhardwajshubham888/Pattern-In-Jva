package LoveBabbarQuestion;
import java.util.Scanner;
public class LoveBabbarQuestion_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array={22,11,9,7,16};
        findArrayMinAndMax(array);
    }

    public static void findArrayMinAndMax(int [] array) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" user enter the value of kth ma and kth min");
        int kthmax=sc.nextInt();
        int kthmin=sc.nextInt();
        for (int i=0; i< array.length-1; i++)
        {
            for (int j=i+1; j< array.length; j++)
            {
                if (array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int ele: array)
        {
            System.out.print(" "+ ele);
        }
        System.out.println();
            System.out.println("kthmax="+array[kthmax]+ "   " + "   kmin="+array[kthmin]);

    }

}
