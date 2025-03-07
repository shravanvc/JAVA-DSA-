package Functions;

import java.util.Scanner;

public class GradeperMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int m = sc.nextInt();
        Grade(m);
    }

    static void Grade(int m) {
        if (m >= 91 && m <= 100){
            System.out.println("grade AA");
        }
        else if (m >= 81 && m <= 90){
            System.out.println("grade AB");
        }
        else if (m >= 71 && m <= 80){
            System.out.println("grade BB");
        }
        else if (m >= 61 && m <= 70){
            System.out.println("grade BC");
        }
        else if (m >= 51 && m <= 60){
            System.out.println("grade CD");
        }
        else if (m >= 41 && m <= 50){
            System.out.println("grade DD");
        }
        else{
            System.out.println("Fail");
        }
    }
}
