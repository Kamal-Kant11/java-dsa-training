// Ques: Find Frequecy of each digits in a number. 

package Loops;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int[] freq = new int[10];

        while(num != 0) {
            int d = num % 10;
            freq[d]++;
            num /= 10;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                System.out.println(i +  " comes " + freq[i] + " times.");
            }

            sc.close();
        }

    }

}
