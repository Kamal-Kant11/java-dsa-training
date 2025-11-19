// Ques: Write a method that calculate the factorial of input number using recursion only.
// void factorial(int num, int result)
// int factorial(int num)

package Recursion.Math;

public class Factorial {

    static void factorial(int num, int result) {
        if(num == 0) {
            System.out.println(result);
            return;
        }
        factorial(num - 1, result * num);
    }

    static int factorial(int num) {
        if(num == 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    public static void main(String[] args) {
        // factorial(6, 1);

        int fact = factorial(6);
        System.out.println(fact);

        
    }

}
