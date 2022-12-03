import java.util.Scanner;

public class PoweOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number then its power ");
        int number = sc.nextInt();
        int power = sc.nextInt();
        int finalans = powerOfNumber(number, power);
        System.out.println(finalans);
    }

    public static int powerOfNumber(int power, int number) {
        if (number == 0) {
            return 1;
        }
        int storeans = power * powerOfNumber(power, number - 1);
        return storeans;
    }
}