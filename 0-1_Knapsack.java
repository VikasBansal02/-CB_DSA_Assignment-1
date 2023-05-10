




	import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = sc.nextInt();
        int[] wt = new int[n];
        int[] profit = new int[n];

        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
  
        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextInt();
        }

        
        knapsack(wt, profit, cap, n);
    }

    public static void knapsack(int[] wt, int[] profit, int cap, int n) {
        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= cap; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], profit[i - 1] + dp[i - 1][j - wt[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
