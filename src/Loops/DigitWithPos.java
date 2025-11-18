// Ques: You have given a number such that the digits can be in between 1 to number of digits (digits are unique only).
// Form a new number by placing the position of each digit at the place of digit itself. 
// Positioning starts from 1 from the right side. 
// E.g.- 32145 -> 12543

package Loops;

import java.util.Scanner;

public class DigitWithPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int copy = num;

        int position = 1;
        int result = 0;

        while(copy != 0) {
            int d = copy % 10;
            result += position * (int) Math.pow(10, d - 1);
            copy /= 10;
            position++;
        }

        System.out.println("Result: " + result);

        scanner.close();
        
    }

}
