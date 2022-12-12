import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nop=sc.nextInt();
		int noc=sc.nextInt();
		int []rank=new int[noc];
		for(int i=0;i<noc;i++)
			rank[i]=sc.nextInt();
		Arrays.sort(rank);
		int lb=0,ans=0;
		int ub=rank[noc-1]*(nop*(nop+1))/2;
		while(lb<=ub){
			int mid=(lb+ub)/2;
			if(ispossible(rank,noc,nop,mid)==true){
				ans=mid;
				ub=mid-1;
			}
			else
				lb=mid+1;
		}
		System.out.println(ans);
	}
	public static boolean ispossible(int []rank,int noc,int nop,int mid){
		int time=0;
		int p=0;
		for(int i=0;i<noc;i++){
			time=rank[i];
			int j=2;
			while(time<=mid){
				p++;
				time+=(rank[i]*j);
				j++;
			}
			if(p>=nop)
				return true;
		}
		return false;
	}
}
