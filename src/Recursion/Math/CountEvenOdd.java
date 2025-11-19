// Write a recursive function to count no of even and odd digits in a given number.
// void evenOddCount(int range, int evenCount, int oddCount)

package Recursion.Math;

public class CountEvenOdd {

    static void evenOddCount(int range, int evenCount, int oddCount) {
        if(range == 0) {
            System.out.println("Even Count is: " + evenCount);
            System.out.println("Odd Count is: " + oddCount);
            return;
        }

        if(range % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        evenOddCount(range - 1, evenCount, oddCount);
    }

    public static void main(String[] args) {
        evenOddCount(15, 0, 0);
    }
     

}
