import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();   
        int[] coins  = new int[m];
        for(int i=0;i<m;i++) {
            coins[i] = sc.nextInt();
        }
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(coins[i-1]<=j) {
                    dp[i][j] = dp[i-1][j]+dp[i][j-coins[i-1]];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
