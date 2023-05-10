import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner scn=new Scanner(System.in);
		int len=scn.nextInt();
		int akd=scn.nextInt();
		int wjn[]=new int[len];
		int value[]=new int[len];
		for(int i=0;i<len;i++){
			wjn[i]=scn.nextInt();
		}
		for(int i=0;i<len;i++){
			value[i]=scn.nextInt();
		}
		int dp[][]=new int[akd+1][len+1];
		for(int a[]:dp) Arrays.fill(a,-1);
		System.out.println(find(wjn,value,akd,0,dp));
    }
	public static int find(int []wjn,int value[],int akd,int idx,int dp[][]){
		if(akd==0 || idx==wjn.length) return 0;
		int inclued=0;
		int exclued=0;
		if(dp[akd][idx]!=-1) return dp[akd][idx];
		if(wjn[idx]<=akd){
			inclued=value[idx]+find(wjn,value,akd-wjn[idx],idx,dp);
		}
		exclued=find(wjn,value,akd,idx+1,dp);
		return dp[akd][idx]=Math.max(inclued,exclued);	
	}
}
