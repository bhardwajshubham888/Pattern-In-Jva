public class FindSameElementInThreeArray {
    public static void main(String[] args) {
        int [] array1={-1,2,3,4,5,8};
        int [] array2={11,99,44,33,0,23};
        int [] array3={21,2,7,55,66,22,};
        sameElementInArray(array1,array2,array3);
    }
    public static void sameElementInArray(int [] array1, int [] array2,int [] array3 )
    {
        for (int i=0; i<array1.length; i++)
        {
            for (int j=0; j<array2.length; j++)
            {

                if (array1[i]==array2[j]&&array1[i]==array3[j])
                {
                    System.out.print(array1[i]+" "+array2[j]+" "+array3[j]);
                    System.out.println();

                }
                else if (array2[i]==array1[j]&&array2[i]==array3[j])
                {
                    System.out.print(array2[i]+" "+array1[j]+" "+array3[j]);
                    System.out.println();
                }
                else if (array3[i]==array2[j]&&array3[i]==array1[j])
                {
                    System.out.print(array3[i]+" "+array1[j]+" "+array2[j]);
                    System.out.println();
                }
            }
        }
    }
}
