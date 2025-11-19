// Ques: Write a method to count number of armstrong upto given range using pure recursion only.
// int countArmstrong (int num)

package Recursion.Math;

public class CountArmstrong {

    static int countDigits(int num) {
        if(num == 0) {
            return 0;
        }
        return countDigits(num / 10) + 1;
    }

    static int power(int num, int pow) {
        if(pow == 0) {
            return 1;
        }
        return power(num, pow - 1) * num;
    }

    static boolean isArmstrong(int num, int sum, int org, int totalDigit) {
        if(num == 0) {
            return org == sum;
        }
        int digitSum = power(num % 10, totalDigit);
        return isArmstrong(num / 10, sum + digitSum, org, totalDigit);
    }

    static int countArmstrong(int range) {
        if(range == 0) {
            return 0;
        }
        boolean isValid = isArmstrong(range, 0, range, countDigits(range));
        return countArmstrong(range - 1) + ((isValid) ? 1 : 0);
    }

    public static void main(String[] args) {
        int cnt = countArmstrong(10000);
        System.out.println(cnt);
    }
}
