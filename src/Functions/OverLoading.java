package Functions;

public class OverLoading {
    public static void main(String[] args) {
//        fun(56);
//        fun("shravan");
       int ans = sum(2,4,5);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a + b;

    }

    static int sum(int a, int b, int c){
        return a + b + c;

    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);

    }
}
