// Ques: Find greatest number among three inputed numbers using nested if-else.

package Conditionals;

import java.util.Scanner;

public class ThreeGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b) {
            if(a > c) {
                System.out.println("First");
            } else {
                System.out.println("Third");
            }
        } else {
            if(b > c) {
                System.out.println("Second");
            } else {
                System.out.println("Third");
            }
        }

        sc.close();
    }
}
