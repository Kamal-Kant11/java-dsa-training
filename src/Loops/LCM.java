// Ques: Given the two number. calculate the LCM for both

package Loops;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b =sc.nextInt();

        int small = Math.min(a, b);
        int large = Math.max(a, b);
        int lcm = Math.max(a, b);               // Smaller no. can also divide larger. E.g. LCM(2, 6) is 6
 
        while(lcm % small != 0) {
            lcm += large;
        }

        System.out.println("L.C.M. of " + a + " and " + b + ": " + lcm);

        sc.close();
    }

}
