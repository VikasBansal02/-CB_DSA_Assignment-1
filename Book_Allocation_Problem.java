import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int []min=new int[test];
		int c=0;
		while(test>0){
			int size=sc.nextInt();
			int nos=sc.nextInt();
			int []arr = new int[size];
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
			int mini=maxof(arr);
			int max=sumof(arr);
			int ans=0;
			while(mini<=max){
				int mid=(mini+max)/2;
				if(ispossible(arr,nos,mid)==true){
					ans=mid;
					max=mid-1;
				}
				else
					mini=mid+1;
			}
			min[c++]=ans;
			test--;
		}
		for(int i=0;i<c;i++){
			System.out.println(min[i]);
		}
    }

	public static int maxof(int []arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
				if(arr[i]>max){
					max=arr[i];
				}
		}
		return max;
	}

	public static int sumof(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}

	public static boolean ispossible(int []arr,int nos,int mid){
		int s=1;
		int readpage=0;
		int i=0;
		while(i<arr.length){
			if(readpage+arr[i]<=mid){
				readpage+=arr[i];
				i++;
			}
			else{
				readpage=0;
				s++;
			}
			if(s>nos)
				return false;
		}
		return true;
	}
}
