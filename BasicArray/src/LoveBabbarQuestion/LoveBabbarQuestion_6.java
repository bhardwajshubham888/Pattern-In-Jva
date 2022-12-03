package LoveBabbarQuestion;

public class LoveBabbarQuestion_6 {
    public static void main(String[] args) {
        int [] array1={1,3,4,5};
        int [] array2={2,3,5,6};
        int [] newArray=new int[array1.length+array2.length];
        inerSection(array1,array2);
    }
    public static void inerSection(int [] array1, int [] array2)
    {
        for (int i=0; i< array1.length; i++)
        {
            for (int j=0; j< array2.length; j++)
            {
                if (array1[i]==array2[j]){
                    System.out.print(array1[i]+" ");
                }
            }
        }
    }
    public static void union()
    {

    }
}
