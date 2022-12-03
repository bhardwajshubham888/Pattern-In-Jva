public class CopyStringInArray {
    public static void main(String[] args) {
        String name="shubham sharma";
        char [] array=new char[name.length()];
        copyValue(array,name);
    }
    public static void copyValue(char[] array, String name)
    {
        for (int i=0; i<name.length(); i++) {
            array[i]=name.charAt(i);
        }
        for (char ele: array) {
            System.out.print(ele);
        }
    }
}
