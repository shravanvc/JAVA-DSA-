package com.shravan;

import java.util.Scanner;

public class PerimeterOfEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length one of the side of the Triangle  ");
        float a = sc.nextFloat();

        float perimeter = 3 * a;

        System.out.println("Perimeter of EquiLateral Triangle :"+ perimeter);


    }
}
