package Functions;

import java.util.Scanner;

public class DiscounCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original price of the Product:");
        double o = sc.nextDouble();
        System.out.println("Enter the discount percentage");
        double d = sc.nextDouble();

        discount(o,d);
    }

    private static void discount(double o, double d) {
        double discountprice, finalprice;
        double originalprice = o;

        discountprice = (d / 100) * o;

        finalprice = o - discountprice;

        System.out.println("Original Price: $" + originalprice);
        System.out.println("The discount Amount: $" + discountprice);
        System.out.println("Final price after discount: $" + finalprice);

    }
}
