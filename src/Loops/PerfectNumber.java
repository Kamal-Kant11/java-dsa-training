// Ques: Given a number tell whether it is a perfect number or not.
// Perfect Number is a number that is equal to its sum of all its proper divisors.

package Loops;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i< num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == num) 
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

            sc.close();
    }

}
