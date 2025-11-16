// Ques: Given three side of the triangle a, b, c determine whether they forms a valid triangle.
// A triangle is valid if:
// a + b > c  
// b + c > a  
// c + a > b  

package Conditionals;

import java.util.Scanner;

public class TriangleValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b)
                    System.out.println("Valid");
                else
                    System.out.println("Invalid");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
