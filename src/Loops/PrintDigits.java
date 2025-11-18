// Ques: Print the digits of a number in separate lines. 
// E.g.- Input: 234 Output: 2 3 4 (each digit in new line)

package Loops;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int copy = num;
        int noOfDigits = 0;

        while(copy != 0) {
            copy /= 10;
            noOfDigits++;
        }

        while (num != 0) {
            int d = num / (int) Math.pow(10, noOfDigits - 1);
            System.out.println(d);
            num = num % (int) Math.pow(10, noOfDigits - 1);
            noOfDigits -= 1;
        }

        sc.close();
    }
}
