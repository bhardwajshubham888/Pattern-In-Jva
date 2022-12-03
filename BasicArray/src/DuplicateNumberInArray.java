public class DuplicateNumberInArray
{
    public static void main(String[] args)
    {
        int [] array={1,2,3,5,5,5,6};
        duplicateNumber(array);
    }
    public static void duplicateNumber(int []array)
    {

        for (int i=0; i<array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++)
            {
                if (array[i] == array[j]);
                {
                    count = count + 1;
                }
            }
           if (count==2) {
               System.out.println(array[i]+"="+ count);
           }
        }
    }
}

