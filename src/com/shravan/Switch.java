package com.shravan;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("king of fruit!");
//            case "Apple" -> System.out.println("a sweet red fuit! ");
//            case "Orange" -> System.out.println("round fruit!");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit!");
//        }

        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            default -> System.out.println("enter valid number");
//        }

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Weekday");
//                break;
//            case 4:
//            case 5:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3 -> System.out.println("Weekday");
            case 4, 5 -> System.out.println("Weekend");
        }

    }
}
