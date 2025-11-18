package Patterns;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        //Pattern 1:
        //     * 
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col <= n - row) {
        //             System.out.print(" ");
        //         }
        //         else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 2:
        //         *       
        //       * * *     
        //     * * * * *             
        //   * * * * * * *
        // * * * * * * * * *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col <= n - row) {
        //             System.out.print("  ");
        //         } else {
        //             for(int star = 1; star <= (2 * row - 1); star++) {
        //                 System.out.print("* ");
        //             }
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }

        

        // Pattern 3:
        // * * * * * 
        //  * * * *
        //   * * *
        //    * *
        //     *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col >= row) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 4:
        // * * * * * * * * *
        //   * * * * * * *
        //     * * * * *
        //       * * *
        //         *
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col < row) {
                    System.out.print("  ");
                }
                else {
                    for(int star = 1; star <= 2 * (n - row) + 1; star++) {
                        System.out.print("* ");
                    }
                    break;
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
