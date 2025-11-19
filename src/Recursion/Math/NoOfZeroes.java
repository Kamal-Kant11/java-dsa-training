// Ques: Write a method to find no of zeroes in a given number using recurion only.
// void noOfZeroes(int num, int count) 
// int noOfZeroes(int num)

package Recursion.Math;

public class NoOfZeroes {

    static void noOfZeroes(int num, int count) {
        if(num == 0) {
            System.out.println(count);
            return;
        }
        noOfZeroes(num / 10, count + (num % 10 == 0 ? 1 : 0));
    }

    static int noOfZeroes(int num) {
        if(num == 0) {
            return 0;
        }
        return noOfZeroes(num / 10) + (num % 10 == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        // noOfZeroes(304000040, 0);

        int cntZeroes = noOfZeroes(304000040);
        System.out.println(cntZeroes);
    }
}
