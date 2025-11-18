package Patterns;

import java.util.Scanner;

public class SquarePattern {

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
        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(row == 1 || row == n || col == 1 || col == n){
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 3: 
        // * * * * *
        // * *   * *
        // *   *   *
        // * *   * *
        // * * * * *

        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row == 1 || row == n || col == 1 || col == n || row == col || col == n - row + 1){
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
