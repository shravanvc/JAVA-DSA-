package Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        isPalindrome(n);
    }

    private static void isPalindrome(int n) {
        int originalnum = n;
        int rem;
        int ans = 0;

        while(n > 0) {
            rem = n % 10;
            n = n / 10;

            ans = ans * 10 + rem;
        }

        if (originalnum == ans){
            System.out.println(originalnum+" is a palindrome");
        }
        else{
            System.out.println(originalnum+" is not a palindrome");
        }

    }
}
