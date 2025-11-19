// Ques: Write a recursive function to replace all the occurence of given valye in array.
// void swapOccurence(int[] arr, int index, int search, int replace)

package Recursion.Arrays;

import java.util.Arrays;

public class SwapOccurence {

    static void swapOccurence(int[] arr, int index, int search, int replace) {
        if(index == arr.length) {
            return;
        }
        if(arr[index] == search) {
            arr[index] = replace;
        }
        swapOccurence(arr, index + 1, search, replace);

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 10, 10, 10, 50};
        swapOccurence(arr, 0, 10, 100);
        System.out.println(Arrays.toString(arr));
    }

}
