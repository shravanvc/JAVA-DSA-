package com.shravan;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 9877676, rem;
        int ans = 0;

        while(n > 0){
            rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
