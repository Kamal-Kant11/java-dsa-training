// Ques: Given a single character, determine wheter it is a vowel or consonent. Assume the input is a lowercase letter from 'a' to 'z'.

package Conditionals;

import java.util.Scanner;

public class VowelsOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
        
        sc.close();
    }
}
