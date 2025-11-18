// Ques: Given a number tell wheter it peterson number or not.
// number equals to the sum of factorial of digits

package Loops;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(isPeterson(num)) {
            System.out.println("Peterson Number");
        } else {
            System.out.println("Not a Peterson Number");
        }

        sc.close();
    }

    static boolean isPeterson(int num) {
        int copy = num;
        int sum = 0;

        // calculating the sum.
        while(copy != 0) {
            int d = copy % 10;
            sum += factorial(d);
            copy /= 10;
        }

        return sum == num;
    }

    static int factorial(int num) {
        int fact = 1;
        while(num != 0) {
            fact *= num--;
        }
        return fact;
    }

}
