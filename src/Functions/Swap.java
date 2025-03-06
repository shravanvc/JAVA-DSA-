package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap two numbers
//        int temp = a;
//        a = b;
//        b = temp;

//        System.out.println(a + " " + b);
        swap(20,30);
        System.out.println(a + " " + b);

        String name = "Shravan";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Rahul rana";  // not changing creating new object
    }


    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
