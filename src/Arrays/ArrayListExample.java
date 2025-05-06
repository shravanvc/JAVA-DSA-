package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(645);
//        list.add(897);
//        list.add(344);
//        list.add(964);
//        list.add(67);
//        list.add(645);
//        list.add(897);
//        list.add(344);
//        list.add(964);
//        list.add(67);
//        list.add(645);
//        list.add(897);
//        list.add(344);
//        list.add(964);
//
//        System.out.println(list.contains(67));
//
//        list.set(0,44);
//
//        list.remove(5);
//
//        System.out.println(list);

        // input
        for (int i = 0; i < 5 ; i++) {
            list.add(sc.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5 ; i++) {
            System.out.println((list.get(i))); // pass the index, list[index] syntax will not work here
        }

        System.out.println(list);
    }
}
