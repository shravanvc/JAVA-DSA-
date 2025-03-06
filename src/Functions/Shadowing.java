package Functions;

public class Shadowing {
    static int x = 90; // this will be at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x ; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 20
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
