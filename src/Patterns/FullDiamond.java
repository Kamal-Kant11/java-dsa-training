package Patterns;

import java.util.Scanner;

public class FullDiamond {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();

        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        //  * * * *
        //   * * *
        //    * * 
        //     *
        
        for(int row = 1; row <= 2 * n - 1; row++) {
            for(int col = 1; col <= n; col++) {
                if(row <= n) {
                    if(col <= n - row) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if(col <= row - n) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }

}
