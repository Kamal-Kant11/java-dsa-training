// Write a recursive function to calculate the sum of first N natural numbers.
// void naturalSum(int n, int sum) 
// int naturalSum(int n)

package Recursion.Math;

public class NaturalSum {

    static void naturalSum(int n, int sum) {
        if(n == 0) {
            System.out.println("Natural Sum: " + sum);
            return;
        }
        naturalSum(n - 1, sum + n);
    }

    static int naturalSum(int n) {
        if(n == 0) {
            return 0;
        }
        return naturalSum(n - 1) + n;
    }

    public static void main(String[] args) {
        // naturalSum(7, 0);

        int ans = naturalSum(5);
        System.out.println("Natural Sum: " + ans);
    }

}
