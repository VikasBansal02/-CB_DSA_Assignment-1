import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		int []ar=new int[test];
		int c=0;
		while(test>0){
			int size=sc.nextInt();
			int []arr=new int[size];
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
			int cmax=arr[0],max=arr[0],cmin=arr[0],min=arr[0],sum=arr[0];
			for(int i=1;i<size;i++){
				sum+=arr[i];
				cmax=Math.max(cmax+arr[i],arr[i]);
				max=Math.max(max,cmax);
				cmin=Math.min(cmin+arr[i],arr[i]);
				min=Math.min(min,cmin);
			}
			sum=Math.max(max,sum-min);
			ar[c++]=sum;
			test--;
		}
		for(int i=0;i<c;i++)
			System.out.println(ar[i]);
    }
}
