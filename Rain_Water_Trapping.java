import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		int []store=new int[test];
		int c=0;
		while(test>0){
			int size=sc.nextInt();
			int []arr=new int[size];
			for(int i=0;i<size;i++){
				arr[i]=sc.nextInt();
			}
			int []lh=new int[size];
			int []rh=new int[size];
			lh[0]=arr[0];
			rh[size-1]=arr[size-1];
			for(int i=1,j=size-2;i<size && j>=0;i++,j--){
				lh[i]=Math.max(lh[i-1],arr[i]);
				rh[j]=Math.max(rh[j+1],arr[j]);
			}
			int sum=0;
			for(int i=0;i<size;i++){
				sum=sum+Math.min(lh[i],rh[i])-arr[i];
			}
			store[c++]=sum;
			test--;
		}
		for(int i=0;i<c;i++){
			System.out.println(store[i]);
		}
    }
}
