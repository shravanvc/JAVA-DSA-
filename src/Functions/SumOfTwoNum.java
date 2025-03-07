package Functions;

import java.util.Scanner;


public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition of two numbers ");
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        sumoftwonum(num1,num2);
    }

    private static void sumoftwonum(int num1, int num2) {
        int sum = 0;
        sum = num1 +num2;
        System.out.println("The addition of two number is "+sum);
    }
}
