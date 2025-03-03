package com.shravan;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

//        switch (empID){
//            case 1:
//                System.out.println("shravan");
//                break;
//            case 2:
//                System.out.println("sagar");
//                break;
//            case 3:
//                System.out.println("yogi");
//                break;
//            case 4:
//                System.out.println("Emp number 4");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default:
//                System.out.println("enter correct empID");
//        }

        switch (empID) {
            case 1 -> System.out.println("shravan");
            case 2 -> System.out.println("sagar");
            case 3 -> System.out.println("yogi");
            case 4 -> {
                System.out.println("Emp number 4");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("enter correct empID");
        }
    }
}
