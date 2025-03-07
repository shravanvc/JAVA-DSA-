package Functions;

import java.util.Arrays;

public class TwoMethodsMaxMin {
    public static void main(String[] args) {
        int max = Largest(2,4,5);
        System.out.println(max);
        int min = Smallest(3,5,6);
        System.out.println(min);
    }

    static int Largest(int a, int b, int c){
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    static int Smallest(int c,int d,int n){
        int min = c;
        if(d < min){
            min = d;
        }
        if(n < min){
            min = n;
        }
        return min;

    }
}
