package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] num = {3, 4, 5, 6, 12};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    public static void change(int[] arr){
        arr[0] = 99;
        arr[4] = 55;
    }
}
