// Ques: Write a method for finding the power of a funtion using recursion only.
// void power(int num, int pow, int res)
// int power(int num, int res)


package Recursion.Math;

public class PowerOfNumber {

    static void power(int num, int pow, int res) {
        if(pow == 0) {
            System.out.println(res);
            return;
        }
        power(num, pow - 1, res * num);
    }

    static int power(int num, int pow) {
        if(pow == 0) {
            return 1;
        }
        return power(num, pow - 1) * num;
    }

    public static void main(String[] args) {
        // power(2, 4, 1);

        int ans = power(2, 6);
        System.out.println(ans);
    }

}
