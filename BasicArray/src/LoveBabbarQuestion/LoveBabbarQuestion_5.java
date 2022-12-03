package LoveBabbarQuestion;

public class LoveBabbarQuestion_5 {
    public static void main(String[] args) {
        int [] array={1,-3,2,11,-1,-7,3,5,-6};
        int [] newArray=new int[array.length];
        copyArray(array,newArray);
        for (int ele: newArray) {
            System.out.print(ele+" ");
        }
    }
    public static void copyArray(int [] array, int [] newArray)
    {
        int m=0;
        int n=1;
        for (int i=0; i< array.length; i++)
        {
            if (array[i]<=0) {
                newArray[m++]=array[i];
            }
            else {
                newArray[array.length-(n++)]=array[i];

            }
        }
    }
}
