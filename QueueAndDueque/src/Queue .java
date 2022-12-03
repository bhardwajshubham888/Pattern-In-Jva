import java.util.Scanner;
    class Queue {
        int front = -1;
        int rare = -1;
        int n = 5;
        int[] array = new int[5];
        public void addElement() {
            Scanner sc = new Scanner(System.in);
            while (rare != (n - 1)) {
                System.out.println(" 1=For Queue and 0=Exit");
                int check = sc.nextInt();
                if (check == 0) {
                    System.out.println(" Programme is end");
                    return;
                }
                System.out.println(" Enter the Element ");
                int input = sc.nextInt();
                rare++;
                array[rare] = input;
            }
            System.out.println(" QUEUE IS OVERFLOW");
        }


        public void removeElement() {
            while (front != rare) {
                Scanner sc = new Scanner(System.in);
                System.out.println(" 1=for Deque 0=Exit");
                int check = sc.nextInt();
                if (check == 0) {
                    System.out.println(" programme is end ");
                    return;
                }
                front++;
                System.out.println(array[front]+" element is removed");
            }
            System.out.println(" QUEUE IS Empty");
        }


        public void printElement() {
            for (int i = front+1; i<= rare; i++) {
                System.out.println(array[i]);
            }
        }


        public static void main(String[] args) {
        Queue obj=new Queue();
        obj.addElement();
        obj.removeElement();
        obj.printElement();

        }
    }

