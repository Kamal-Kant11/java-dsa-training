// Ques: Write a recursive method to check the number is present or not in a array
// boolean isFound(int[] arr, int index, int searchValue) 

package Recursion.Arrays;

public class FindInArray {

    static boolean isFound(int[] arr, int index, int searchValue) {
        if(index == arr.length) {
            return false;
        }
        if(arr[index] == searchValue) {
            return true;
        }
        return isFound(arr, index + 1, searchValue);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(isFound(arr, 0, 30) ? "Found" : "Not Found");
    }

}
