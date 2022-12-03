package LoveBabbarQuestion;

public class LoveBabbarQuestion_2 {
    public static void main(String[] args) {
        int [] array={2,3,5,1,7};
        int max=array[0];
        int min=array[0];
        for(int i=0; i< array.length; i++)
        {
            if (max<array[i]) {
                max=array[i];
            }
            else {
                min=array[i];
            }
        }
        System.out.println("max="+max + "  min="+min );
    }
}
