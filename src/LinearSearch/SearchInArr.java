package LinearSearch;

public class SearchInArr {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 33, 55, 76, -33, 55, -65, 44};
        int target = 66;
//        boolean ans = linearSearch3(nums, target);
        int ans = linearSearch2(nums, target);
        System.out.println(ans);
    }
    // return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0){
            return false;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target){
                return true;
            }

        }
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }

        //run for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    //otherwise if item not found return -1
//    static int linearSearch(int[] arr, int target) {
//        if(arr.length == 0){
//            return -1;
//        }
//
//        //run for loop
//        for (int i = 0; i < arr.length; i++) {
//            // check for element at every index if it is = target
//            int element = arr[i];
//            if (element == target){
//                return i;
//            }
//
//        }
//        return -1;
//    }
}
