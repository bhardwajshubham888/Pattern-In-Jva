public class StringInCharStore {
    public static void main(String[] args) {
        String name="shubham sharma";
        copyStringInArray(name);
    }
    public static void copyStringInArray(String name)
    {
        char [] array=new char[name.length()];
        for (int i=0; i< name.length(); i++)
        {
            array[i]=name.charAt(i);
        }
        for (char ele: array)
        {
            System.out.print(ele);
        }
    }
}
