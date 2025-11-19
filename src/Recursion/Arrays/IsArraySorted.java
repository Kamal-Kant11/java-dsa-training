// Write a recursive function to check the array is sorted or not
// boolean isSorted(int[] arr, int index) 


package Recursion.Arrays;

public class IsArraySorted {


    static boolean isSorted(int[] arr, int index) {
        if(index == arr.length - 1) {
            return true;
        }
        if(arr[index] >= arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 70, 50};
        System.out.println(isSorted(arr, 0) ? "Sorted" : "Not Sorted");
    }
}
