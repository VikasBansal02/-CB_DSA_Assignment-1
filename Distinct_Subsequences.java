import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);

        int test = cin.nextInt();
        cin.nextLine();

        for(int i=0;i<test;i++){
            String str = cin.nextLine();
            String tr = cin.nextLine();
            long dp[][]=new long[str.length()][tr.length()];
            for(long a[]:dp) Arrays.fill(a,-1);
            System.out.println(find(str, tr,0,0,dp));
        }
    }
    

    public static long find(String str, String tr,int idxi,int idxj,long dp[][]) {
// Write Code here
        if(idxj==tr.length()) return 1;
        if(idxi==str.length()) return 0;
        long inc=0;
        long exc=0;
        if(dp[idxi][idxj]!=-1) return dp[idxi][idxj]; 
        if(str.charAt(idxi)==tr.charAt(idxj)){
            inc=find(str,tr,idxi+1,idxj+1,dp);
        }
        exc=find(str,tr,idxi+1,idxj,dp);
        return dp[idxi][idxj]=inc+exc;
    }

}
