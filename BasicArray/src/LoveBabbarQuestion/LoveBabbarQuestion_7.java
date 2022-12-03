package LoveBabbarQuestion;
public class LoveBabbarQuestion_7 {
            public static void main(String[] args) {
                int [] array={1,2,3,4,5,7,8};
                int [] newArray=new int[array.length];
                int rotation=1;
                rotation(array,newArray,rotation);
            }
            public static void rotation(int [] array,int [] newArray ,int rotation)
            {
                for (int i=0; i< array.length; i++) {
                    newArray[(rotation+i) %array.length]= array[i];
                }
                for (int ele: newArray) {
                    System.out.print(ele+" ");
                }
            }
}
