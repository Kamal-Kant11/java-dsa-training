package Loops;

import java.util.Scanner;

public class Armstrong {

    static void isArmstrong(int num) {
        int copy = num;
        int noOfDigits = 0;
        int sum = 0;

        // Count the digits
        while(copy != 0) {
            noOfDigits++;
            copy /= 10;
        }

        copy = num;
        // Finding sum
        while (copy != 0) {
            int d = copy % 10;
            sum += Math.pow(d, noOfDigits);
            copy /= 10;
        }

        // Checking armstrong or not
        if(sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        isArmstrong(num);

        sc.close();
    }
}
