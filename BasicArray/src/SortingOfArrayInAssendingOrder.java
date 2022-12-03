public class SortingOfArrayInAssendingOrder {
    public static void main(String[] args) {
        int [] array={11,22,0,4,5,6};
        int temp=0;
        for (int i=0; i< array.length; i++)
        {
            for (int j=0; j< array.length-1-i; j++)
            {
                if(array[j]>array[j+1])
                {
                     temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            for (int ele: array)
            {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
