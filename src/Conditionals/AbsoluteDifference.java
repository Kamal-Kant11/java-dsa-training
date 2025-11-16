// Ques: Givem two integers x and y, calculate their absolute difference. If diff is greater than 10, print "Large Difference"; otherwise, print "Small Differnece". 

package Conditionals;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int abs = Math.abs(x - y);

        if(abs > 10) {
            System.out.println("Large Differnece");
        } else {
            System.out.println("Small Differnce");
        }

        sc.close();
    }
}
