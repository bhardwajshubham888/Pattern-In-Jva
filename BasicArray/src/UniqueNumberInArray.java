 public class UniqueNumberInArray {
     public static void main(String[] args) {
        int [] array={0,2,3,4,4,5,5,7,7};
        int length=array.length;
        printUniqueNumber(array,length);

    }
    public static void printUniqueNumber(int [] array, int length)
    {
        for (int i=0; i<length; i++)
        {
            int count=0;
            for (int j=0; j<length; j++)
            {
                if (array[i]==array[j])
                {
                    count=count+1;
                }
            }
            if (count==1)
            {
                System.out.println(array[i]+"="+ count);
            }
        }
    }
}


