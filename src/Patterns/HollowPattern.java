package Patterns;

import java.util.Scanner;

public class HollowPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();


        // Pattern 1:
        // *
        // * *
        // *   *
        // *     *
        // * * * * *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col == 1 || col == row || row == n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 2:
        // * * * * *
        // *     *
        // *   *
        // * *
        // *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(row == 1 || col == 1 || col == n - row + 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 3:
        //         *
        //       * *
        //     *   *
        //   *     *
        // * * * * *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col == n || row == n || col == n - row + 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 4:
        // * * * * *
        //   *     *
        //     *   *
        //       * *
        //         *
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col == n || row == 1 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        sc.close();
    }

}
