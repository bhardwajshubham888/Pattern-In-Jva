public class CountTargetInArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,3,4,7,7,7,8,9,7};
        int target=2;
        countTarget(array,target);
    }
    public static void countTarget(int [] array, int target)
    {
        int count=0;
        for (int i=0; i< array.length; i++)
        {
            if (array[i]==target)
            {
                count=count+1;
            }
        }
        System.out.println("target="+ count);
    }
}
