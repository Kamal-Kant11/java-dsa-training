// Ques: Write a program to print Fibonacci series up to n terms.

package Loops;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (number of terms): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for n.");
            sc.close();
            return;
        }

        long a = -1;
        long b = 1;

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
        sc.close();
    }
}
