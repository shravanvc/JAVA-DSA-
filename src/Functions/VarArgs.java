package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 77, 56, 78, 90);
        multiple(2,3,"sagar","shravan");

    }

    static void multiple(int a, int b, String ...v ){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
