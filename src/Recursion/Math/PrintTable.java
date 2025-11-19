// Ques: Write a method for printing the table of a number till given range using recursion only.
// void printTable(int num, int range, String result)
// void printTable(int num, int range)

package Recursion.Math;

public class PrintTable {

    static void printTable(int num, int range, String result) {
        if(range == 0) {
            System.out.println(result);
            return;
        }
        String exp = num + " X " + range + " = " + (num * range); 
        printTable(num, range - 1, exp + "\n" + result);

    }

    static void printTable(int num, int range) {
        if(range == 0) {
            return;
        }
        printTable(num, range - 1);
        System.out.println(num + " X " + range + " = " + (num * range));
    }

    public static void main(String[] args) {
        // printTable(5, 10, "");
        printTable(5, 5);


    }

}
