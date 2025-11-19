// Ques: Writa a recursive that take the array of prices and retrun the array of new prices with gst.
// int[] getPricesWithGST(int[] prices, int index)

package Recursion.Arrays;

import java.util.Arrays;

public class GST {

    static int[] getPricesWithGST(int[] prices, int index) {
        if(index == prices.length){
            int[] GST = new int[prices.length];
            return GST;
        }
        int[] GST = getPricesWithGST(prices, index + 1);
        GST[index] = prices[index] + (int)(0.18 * prices[index]);
        return GST;
    }

    public static void main(String[] args) {
        int[] prices = {100, 200, 300, 400, 500, 700};
        // newPrices = price + 18%
        int[] newPrices = getPricesWithGST(prices, 0);
        System.out.println(Arrays.toString(newPrices));
    }

}
