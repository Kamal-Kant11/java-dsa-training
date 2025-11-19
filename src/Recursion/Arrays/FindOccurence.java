// Write a recursive function to find the index where the input number is present
// int[] find(int[] arr, int index, int search)

package Recursion.Arrays;

import java.util.Arrays;

public class FindOccurence{

    static int[] findHelper(int[] arr, int index, int searchValue, int count) {
        if(index == arr.length) {
            int[] res = new int[count];
            return res;
        }
        int[] res;
        if(arr[index] == searchValue) {
            res = findHelper(arr, index + 1, searchValue, count + 1);
            res[count] = index;
        }
        else{
            res = findHelper(arr, index + 1, searchValue, count);
        }
        return res;
    }

    static int[] find(int[] arr, int index, int searchValue) {
        return findHelper(arr, index, searchValue, 0);

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 10, 40, 10, 50, 10};
        int[] result = find(arr, 0, 10);
        System.out.println(Arrays.toString(result));
    }
}
