// Ques: Swap the First and Last digits of a number.

package Loops;

import java.util.Scanner;

public class SwapFirstLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int noOfDigits = 0;

        int copy = num;
        // Count number of digits
        while(copy != 0) {
            noOfDigits++;
            copy /= 10;
        } 

        int first = num / (int)Math.pow(10, noOfDigits - 1);
        int last = num % 10;
        int mid = (num % (int)Math.pow(10, noOfDigits - 1)) / 10;
        
        
        // Calculating result
        int res = last * (int) Math.pow(10, noOfDigits - 1) + mid * 10 + first;
        System.out.println("After Swapping : " + res);
        sc.close();
    }

}
