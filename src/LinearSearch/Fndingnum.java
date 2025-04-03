package LinearSearch;

public class Fndingnum {
    public static void main(String[] args) {
        int num = 44;

        isFound(num);
    }

    private static void isFound(int num) {
        int[] arr = {1, 23, 44, 56, 78, 33};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 44){
                System.out.println("the number was found!");
            }
            else{
                System.out.println("the number was not found!");
            }
        }
    }
}
