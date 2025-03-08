package Functions;

import java.util.Scanner;

public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        pythogoreantriplet(a,b,c);
    }

    private static void pythogoreantriplet(int a, int b, int c) {
        System.out.println("sum of squares of two number:");
        int sum ;
        int k ;
        sum = (a * a) + (b * b);
        System.out.println(sum);
        System.out.println("the square of third number:");
        k = c * c;
        System.out.println(k);

        if (sum == k){
            System.out.println("The give numbers are the pythagorean triplet!");
        }
        else{
            System.out.println("The given numbers are not a pythagorean triplet");
        }
    }
}
