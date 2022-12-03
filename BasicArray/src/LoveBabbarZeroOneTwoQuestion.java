public class LoveBabbarZeroOneTwoQuestion {
    public static void main(String[] args) {
        int [] array={0,1,2,2,1,0,2,1,0};
        zeroOneTwo(array);
    }

    public static void zeroOneTwo(int [] array)
    {
        int count=0;
        for (int i=0; i< array.length; i++)
        {
        for (int j=0; j< array.length; j++)
        {
            if (count == array[j])
            {
                System.out.print(" "+array[i]);
            }
        }
            count++;
        }
    }
}
