package Functions;

import java.util.Scanner;

public class ProductOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication of two numbers!");
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        Product(num1,num2);
    }

    private static void Product(int num1, int num2) {
        int mul = 0;
        mul = num1 * num2;
        System.out.println("Multiplication of two number is "+mul);
    }
}
