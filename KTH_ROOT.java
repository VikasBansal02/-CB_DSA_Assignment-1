import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int []store=new int[test];
		int c=0;
		while(test>0){
			long num=sc.nextLong();
			int k=sc.nextInt();
			long lo=1,hi=num,ans=0;
			while(lo<=hi){
				long mid=lo+(hi-lo)/2;
				if(Math.pow(mid,k)<=num){
					ans=mid;
					lo=mid+1;
				}
				else
					hi=mid-1;
			}
			store[c++]=(int)ans;
			test--;
		}
		for(int i=0;i<c;i++)
			System.out.println(store[i]);
    }
}
