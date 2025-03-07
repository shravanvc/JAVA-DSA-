package Functions;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area and the circumference and area of the circle!");

        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();

        Area(r);
        Circumference(r);
    }

    private static void Circumference(double r) {
        double C = 0;
        double PI = 3.14159f;
        System.out.println("Circumference of the circle is:");
        C = 2 * PI * r;
        System.out.println(C);
    }

    private static void Area(double r) {
        double A = 0;
        double PI = 3.14159f;
        System.out.println("Area of the circle is:");
        A = PI * (r * r);
        System.out.println(A);
    }

}
