package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        String name = "Shravan";
        {
//            int a = 78; // already initialised outside the block in the same method, hence you cannot initialised again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
             int c = 50;
             name = "Sagar";
            System.out.println(name);
             //value initialised in the this block, will remains in block
        }
        int c = 100;
        System.out.println(c);
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); //cannot use outside the block

        // Scoping in for loops
        for (int i = 0; i <= 5; i++){
            System.out.println(i);
            a = 200;
        }
        System.out.println(a);
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
