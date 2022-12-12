import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int nop=sc.nextInt();
		int size=sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int mini=maxof(arr);
		int max=sumof(arr);
		int ans=0;
		while(mini<=max){
			int mid=(mini+max)/2;
			if(ispossible(arr,nop,mid)==true){
				ans=mid;
				max=mid-1;
			}
			else
				mini=mid+1;
		}
		System.out.println(ans);
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

	public static boolean ispossible(int []arr,int nop,int mid){
		int p=1;
		int paint=0;
		int i=0;
		while(i<arr.length){
			if(paint+arr[i]<=mid){
				paint+=arr[i];
				i++;
			}
			else{
				paint=0;
				p++;
			}
			if(p>nop)
				return false;
		}
		return true;
	}
}
