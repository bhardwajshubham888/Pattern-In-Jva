public class SumOfNatrualNumber {
    public static void main(String[] args) {
        System.out.println(sumOfNatralNumber(5));
    }
    public static int sumOfNatralNumber(int num)
    {
        if (num==0){
            return 1;
        }
        return (num*sumOfNatralNumber(num-1));
    }
}
