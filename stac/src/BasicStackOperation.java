import java.util.Scanner;
public class BasicStackOperation {
    int top=-1;
    int peak=5;
    int [] array=new int[peak];

    public void insetElement() {
         Scanner sc=new Scanner(System.in);
          while (top!=(peak-1)) {
                System.out.println("1=For Push & 0=for End Programe");
                int check=sc.nextInt();
                if (check==0) {
                    return;
                }
                System.out.println(" user Enter the data");
                int input=sc.nextInt();
                top++;
                array[top] = input;
            }
        System.out.println(" stack is  overflow");
        }


    public void extractElement() {
        Scanner sc=new Scanner(System.in);
        while (top!=-1)
        {
                System.out.println("1=For Pop & 0=for End");
                    int check = sc.nextInt();
                    if (check == 0) {
                        System.out.println(" Programe End");
                        return;
                    }
                    System.out.println(array[top] + "=item was deleted");
                    top--;
            }
        System.out.println("stack is empty");
        }

    public void printElemet() {
        for (int j=top; j>=0; j--) {
            System.out.print(" "+array[j]);
        }
    }


    public static void main(String[] args) {
BasicStackOperation item=new BasicStackOperation();
System.out.println(" user enter the length of the stack");

item.insetElement();
item.extractElement();
item.printElemet();
    }
}
