package Patterns;

import java.util.Scanner;

public class StartPattern {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        
        // Pattern 1:
        // * * * * * 
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Pattern 2:
        // * 
        // * *
        // * * *
        // * * * *
        // * * * * * 
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col <= row) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


        // Pattern 3:
        // * * * * * 
        // * * * *
        // * * *
        // * *
        // *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col >= row) {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 4:
        //         * 
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col <= n - row) {
        //             System.out.print("  ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 5:
        // * * * * * 
        //   * * * *
        //     * * *
        //       * *
        //         * 
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col >= row) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}
