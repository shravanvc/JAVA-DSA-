package Functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        EvenOdd(num);

    }

    static int EvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num+ " is a even number:");
            return num;
        }
        else {
            System.out.println(num+ " it is a odd number");
            return num;
        }
    }
}
