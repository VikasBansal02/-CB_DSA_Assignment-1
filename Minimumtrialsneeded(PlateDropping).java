// import the required package(s)

import java.util.*;

public class Main 
{
    
    public static void main(String args[]) 
    {
        Scanner vikas_sc = new Scanner(System.in);
        
        int vikas_t = vikas_sc.nextInt();
        
        while(vikas_t > 0) 
        {
            int vikas_k = vikas_sc.nextInt();
            
            int vikas_n = vikas_sc.nextInt();
            
            // Initializing the DP array
            int[][] vikas_dp = new int[vikas_k + 1][vikas_n + 1];
            
            // Filling the base cases
            for(int vikas_i = 0; vikas_i <= vikas_k; vikas_i++) 
            {
                vikas_dp[vikas_i][0] = 0;
                vikas_dp[vikas_i][1] = 1;
            }
            
            for(int vikas_i = 0; vikas_i <= vikas_n; vikas_i++) 
            {
                vikas_dp[0][vikas_i] = 0;
                vikas_dp[1][vikas_i] = vikas_i;
            }
            
            // Filling the DP array
            for(int vikas_i = 2; vikas_i <= vikas_k; vikas_i++) 
            {
                for(int vikas_j = 2; vikas_j <= vikas_n; vikas_j++) 
                {
                    int vikas_min = Integer.MAX_VALUE;
                    
                    for(int vikas_x = 1; vikas_x <= vikas_j; vikas_x++) 
                    {
                        int vikas_val = 1 + Math.max(vikas_dp[vikas_i - 1][vikas_x - 1], vikas_dp[vikas_i][vikas_j - vikas_x]);
                        vikas_min = Math.min(vikas_min, vikas_val);
                    }
                    
                    vikas_dp[vikas_i][vikas_j] = vikas_min;
                }
            }
            
            // Printing the answer
            System.out.println(vikas_dp[vikas_k][vikas_n]);
        
            vikas_t--;
            
        }
    }
}
