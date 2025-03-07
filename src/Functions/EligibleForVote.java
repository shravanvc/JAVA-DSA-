package Functions;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person:");
        int age = sc.nextInt();
        EligibleToVote(age);

    }

    static void EligibleToVote(int age) {
        if (age >= 18){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }
}
