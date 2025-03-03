package com.shravan;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        int num = sc.nextInt();
//        System.out.println(num);

//        Type casting
//        int num = (int)(56.67f);
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 256;
//        byte b = (byte)(a); //257 % 256 = 1
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println(number);

//        System.out.println(3 * 5.6);

        byte a = 50;
        char b = 'a';
        short c = 200;
        int d = 5000;
        float s = 50.67f;
        double e = 3300.44474;
        double result = (s * a)+(d / b)-(e * c);
        // float + int - double = double
        System.out.println((s * a)+" "+(d / b)+" "+(e * c));
        System.out.println(result);


    }
}
