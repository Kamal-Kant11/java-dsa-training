package Patterns;

import java.util.Scanner;

public class DiagonalPattern {

    public static void main(String[] args) {

        // *       *
        //   *   *
        //     *
        //   *   *
        // *       *
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row == col || col == n - row + 1) {
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
