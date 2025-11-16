// Ques: Given a student's marks in a subject, assign a grade based on the followin criteria.
// 90 <= marks <= 100: Print "A".
// 80 <= marks < 90: Print "B".
// 70 <= marks < 80: Print "C".
// 60 <= marks < 70: Print "D".
// marks < 60: Print "F".

package Conditionals;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks = sc.nextInt();

        if (90 <= marks && marks <= 100) {
            System.out.println("A");
        } else if (80 <= marks && marks < 90) {
            System.out.println("B");
        } else if (70 <= marks && marks < 80) {
            System.out.println("C");
        } else if (60 <= marks && marks < 70) {
            System.out.println("D");
        } else if (marks < 60) {
            System.out.println("F");
        } else {
            System.out.println("Enter in the range of 0 to 100");
        }

        sc.close();
    }

}
