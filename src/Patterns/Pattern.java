package Patterns;

public class Pattern{
    public static void main(String[] args) {

        // Pattern 1:
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // int n = 5;
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col <= row) {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 2:
        // * * * * * 
        // * * * * 
        // * * *
        // * *
        // *
        // int n = 5;
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col >= row) {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 3:
        //         * 
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        // int n = 5;
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col <= n - row) {
        //             System.out.print("  ");
        //         }
        //         else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 4:
        // * * * * * 
        //   * * * * 
        //     * * *
        //       * *
        //         *
        // int n = 5;
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(col >= row) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 5:
        // * * * * * 
        // *       *
        // *       *
        // *       *
        // * * * * *
        // int n = 5;
        // for(int row = 1; row <= n; row++) {
        //     for(int col = 1; col <= n; col++) {
        //         if(row == 1 || row == n) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             if(col == 1 || col == n) {
        //                 System.out.print("* ");
        //             }
        //             else {
        //                 System.out.print("  ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }


        //Pattern 6:
        //     * 
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        // int n = 5;
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


        // Pattern 7:
        // * * * * * 
        //  * * * *
        //   * * *
        //    * *
        //     *
        int n = 5;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col >= row) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // Pattern 8: 
        // int n = 5;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n; j++) {
                
        //     }
        //     System.out.println();
        // }


    }

}