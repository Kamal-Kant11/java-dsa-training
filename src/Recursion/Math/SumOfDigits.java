// Ques: Write a method for finding the sum of digits using recursion only.
// void sumOfDigits(int num, int sum)
// int sumOfDigits(int num)

package Recursion.Math;

public class SumOfDigits {

    static void sumOfDigits(int num, int sum) {
        if(num == 0) {
            System.out.println(sum);
            return;
        }
        sumOfDigits(num / 10, sum + (num % 10));
    }

    static int sumOfDigits(int num) {
        if(num == 0) {
            return 0;
        }
        return sumOfDigits(num / 10) + num % 10;
    }

    public static void main(String[] args) {
        // sumOfDigits(68769, 0);

        int sum = sumOfDigits(6575);
        System.out.println(sum);
    }
}
