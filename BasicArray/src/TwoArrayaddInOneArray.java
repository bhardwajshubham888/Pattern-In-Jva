public class TwoArrayaddInOneArray
{
    public static void main(String[] args)
    {
        int [] a={1,2,3,4};
        int [] b={5,6,7,8};
        findDoubleElement(a,b);
    }

    public static void findDoubleElement(int [] a, int [] b)
    {
        int [] c=new int[a.length+b.length];
        int m=0;
        for (int i=0; i<a.length; i++)
        {
            c[m++]=a[i];
            c[m++]=b[i];
        }
        for (int ele: c)
        {
            System.out.print(" "+ele);
        }
    }

}
