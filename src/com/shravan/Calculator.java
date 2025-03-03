package com.shravan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;

        while (true){
            //take the operator as an input
            System.out.println("enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.println("enter two numbers:c");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'x'){
                break;

            }else{
                System.out.println("invalid operation");
            }
            System.out.println(ans);
        }

    }
}
