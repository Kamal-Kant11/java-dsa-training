// Ques: Write a frecursive function to count the number of occurence in the array
// int countOccurence(int[] arr, int index, int search, int count)

package Recursion.Arrays;

public class CountOccurence {


    static int countOccurence(int[] arr, int index, int search, int count) {
        if(index == arr.length) {
            return count;
        }
        if(arr[index] == search) {
            count++;
        }
        return countOccurence(arr, index + 1, search, count);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40 ,10, 10, 10, 10};
        System.out.println(countOccurence(arr, 0, 10, 0));
    }
}
