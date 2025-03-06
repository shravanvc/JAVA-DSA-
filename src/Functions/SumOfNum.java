package Functions;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("Enter the number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of the two numbers :" +sum);
    }
}
