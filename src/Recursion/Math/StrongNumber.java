// Ques: Write a recursive program to check whether a given number is a Strong number or not.
// A Strong number is a number whose sum of the factorial of digits is equal to the number itself.
// void isStrongNumber(int num, int sum, int org)

package Recursion.Math;

public class StrongNumber {

    static int factorial(int num) {
        if(num == 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    static void strongNumber(int num, int sum, int org) {
        if(num == 0) {
            System.out.println(sum == org ? "Peterson Number" : "Not a Peterson");
            return;
        }
        strongNumber(num / 10, sum + factorial(num % 10), org);
    }

    public static void main(String[] args) {
        strongNumber(145, 0, 145);
    }
}
