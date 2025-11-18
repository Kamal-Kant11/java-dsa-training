// Ques: Given a number, calculate the sum of even and odd digits separately. 
// Note: Take 1 place from right
// E.g.- 8765 -> Even Sum = 6 + 8 = 14, Odd Sum = 5 + 7 = 12

package Loops;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        int position = 1;

        while(num != 0) {
            int digit = num % 10;
            num = num / 10;
            if(position % 2 == 0) {
                evenSum += digit;
            }
            else {
                oddSum += digit;
            }
            position++;
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);

        sc.close();
    }

}
