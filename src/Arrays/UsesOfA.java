package Arrays;

public class UsesOfA {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person name
        String name = "Shravankumar";

        // syntax
        // datatype[] variable_name = new datatype[size];
        // Q: store 5 roll number
        int[] rollnos = new int[5];
        // or directly
        int[] rollnos2 = {23, 56, 78, 45, 23};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation actually here object is being created in the memory (heaap)

        System.out.println(ros[4]);

        String[] arr = new String[4];
        System.out.println(arr[2]);


    }
}
