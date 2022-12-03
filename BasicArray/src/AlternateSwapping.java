public class AlternateSwapping {
    public static void main(String[] args)
    {
        int [] array={2,1,4,3,6,5};
        alternateSwapping(array);
    }
    public static void alternateSwapping(int [] array)
    {
    for (int i=0; i< array.length; i++)
    {
        int temp=array[i];
         array[i]=array[i+1];
         array[i+1]=temp;
         i=i+1;
    }
        for (int ele: array)
        {
            System.out.print(" "+ ele);
        }

    }

}
