// Ques: Find the greatest number among 4 inputed numbers using Nested if-else.

package Conditionals;

import java.util.Scanner;

public class FourGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d)
                    System.out.println("First");
                else
                    System.out.println("Fourth");
            } else {
                if (c > d)
                    System.out.println("Third");
                else
                    System.out.println("Fourth");
            }
        } else {
            if (b > c) {
                if (b > d)
                    System.out.println("Second");
                else
                    System.out.println("Fourth");
            } else {
                if (c > d)
                    System.out.println("Third");
                else
                    System.out.println("Fourth");
            }
        }

        sc.close();
    }
}