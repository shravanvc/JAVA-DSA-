package com.shravan;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        int n = 645345, rem;

        int count = 0;
        while (n > 0){
            rem = n % 10;

            if (rem == 5){
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}
