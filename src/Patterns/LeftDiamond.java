package Patterns;

import java.util.Scanner;

public class LeftDiamond {

    public static void main(String[] args) {
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        for (int row = 1; row <= n - 1; row++) {
            for (int col = 1; col <= n / 2; col++) {
                if (row <= n / 2) {
                    if (col <= row) {
                        System.out.print("* ");
                    }
                } else {
                    if(col <= n - row) {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
