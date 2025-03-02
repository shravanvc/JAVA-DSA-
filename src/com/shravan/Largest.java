package com.shravan;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        Q:find the largest of three numbers
//        if(a > b && a > c){
//            System.out.println("a is the largest");
//        }
//        else if(b > c && b > c){
//            System.out.println(" b is the largest");
//        }
//        else{
//            System.out.println(" c is the largest");
//
//        }



//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }



        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
