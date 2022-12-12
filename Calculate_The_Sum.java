import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int t=sc.nextInt();
		// int sum=0;
		while(t>0){
			int n=sc.nextInt();
			if(n==0){
				for(int i=0;i<size;i++)
					arr[i]+=arr[i];
			}
			else{
				int temp=arr[size-1];
				int pre=arr[n-1];
				for(int i=n;i<size;i++){
					int te=pre;
					pre=arr[i];
					arr[i]+=te;
				}
				for(int i=n-1;i>0;i--)
					arr[i]+=arr[i-1];
				arr[0]+=temp;
			}
			t--;
		}
		int sum=0;
		for(int i=0;i<size;i++)
			sum+=arr[i];
		System.out.println(sum);
    }
}
