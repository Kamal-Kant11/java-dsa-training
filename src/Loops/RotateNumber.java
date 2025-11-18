// Ques: Given a number 12345
// E.g.- on 1 rotation output is 51234
//       on 2 rotation output is 45123

package Loops;

import java.util.Scanner;

public class RotateNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the number of rotation");
        int rot = sc.nextInt();

        int noOfDigits = 0;

        // counting the number of digits
        int copy = num;
        while(copy != 0) {
            noOfDigits++;
            copy /= 10;
        }

        // dividing number in 2 halves acc to ques 
        int left = num / (int) Math.pow(10, rot);
        int right = num % (int) Math.pow(10, rot);

        // System.out.println(right + "" + left);


        // Calculate the result
        int res = right * (int)Math.pow(10, noOfDigits - rot) + left;
        System.out.println("Rotated number is: " + res);

        sc.close();
    }

}
