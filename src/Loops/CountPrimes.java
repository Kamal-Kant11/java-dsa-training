// Ques: Count the number of primes from 1 to n.

package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class CountPrimes {

    // Optimized Approach - Sieve of Eratosthenes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        if(n == 0 || n == 1) {
            System.out.println("Number of primes are: " + 0);
        }
        else {
            boolean[] isPrime = new boolean[n];
            Arrays.fill(isPrime, true);

            isPrime[0] = false;
            isPrime[1] = false;

            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            int cnt = 0;
            for (int i = 0; i < isPrime.length; i++) {
                if (isPrime[i])
                    cnt++;
            }
            System.out.println("Number of primes are: " + cnt);
        }

        sc.close();

    }

    // Simple Approach
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number");
    //     int n = sc.nextInt();

    //     int cnt = 0;
    //     for (int i = 2; i <= n; i++) {
    //         if (isPrime(i)) {
    //             cnt++;
    //         }
    //     }
    //     System.out.println("Number of primes are: " + cnt);
    //     sc.close();
    // }

    // static boolean isPrime(int num) {
    //     for (int i = 2; i * i <= num; i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}
