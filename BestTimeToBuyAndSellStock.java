import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maximumProfit = Math.max(maximumProfit, prices[i] - minimumPrice);
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }
        return maximumProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter prices:");
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        System.out.println("Maximum profit: " + maxProfit(prices));
        sc.close();
    }
}