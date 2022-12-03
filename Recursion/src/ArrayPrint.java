public class ArrayPrint {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        int n=array.length-1;
        int avg=printArray(array,n);
        System.out.println((avg/ array.length));
    }
    public static int printArray(int [] array, int index)
    {
        if (index==0) {
            return array[0];
        }
        int sum=(array[index]+printArray(array,index-1));
        return (sum);
    }
}
