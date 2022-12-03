package LoveBabbarQuestion;

public class LoveBabbarQuestion_1 {
    public static void main(String[] args) {
        int [] array={23,74,18,41,22,20};
        int temp=0;
        for (int i=0; i<(array.length)/2; i++)
        {
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-i-1]=temp;
        }
        for (int ele: array)
        {
            System.out.print(" "+ ele);
        }
    }
}
