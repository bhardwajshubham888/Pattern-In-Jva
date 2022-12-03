public class OneSidePositiveOneSideNeagitive {
    public static void main(String[] args) {
        int [] array={1,-1,3,4,-7,-5,11};
        int n=array.length;
        oneSidePositiveOneSideNeagitive(array,n);
    }


    public static void oneSidePositiveOneSideNeagitive(int [] array, int n)
    {
        int [] newArray=new int[array.length];
        int a=0;
        int b=1;
        for (int i=0; i<array.length; i++)
        {
            if (array[i]>=0) {
                newArray[a]=array[i];
                a++;
            }
            else {
                newArray[array.length-b]=array[i];
                b++;
            }
        }
        print(newArray);
    }


    public static void print(int [] a)
    {
        for (int ele: a)
        {
            System.out.print(" "+ele );
        }
    }
}
