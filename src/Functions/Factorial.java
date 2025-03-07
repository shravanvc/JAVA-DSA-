package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        factorial(n);
    }

    private static void factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        System.out.println("Factorial of "+n+" is "+f);
    }
}
