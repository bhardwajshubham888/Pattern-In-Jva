package LoveBabbarQuestion;

public class LoveBabbar_4 {
    public static void main(String[] args) {
        int [] array={0,1,2,1,0,1,2,0,1,0,0,1,2,2,1,1};
        int count=0;
        flagPrograme(array,count);

    }
    public static void flagPrograme(int [] array, int count)
    {
        for (int i=0; i< array.length; i++)
        {
            for (int j=0; j< array.length; j++)
            {
                if (count==array[j]) {
                    System.out.print(array[j]+" ");
                }
            }
            count++;
        }
    }
}
