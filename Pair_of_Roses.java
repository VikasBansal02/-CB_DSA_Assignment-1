import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		int [][]price=new int[test][2];
		int c=0;
		while(test>0){
			int size=sc.nextInt();
			int []arr=new int[size];
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			int target=sc.nextInt();
			int m=0,n=0;
			for(int i=0;i<size-1;i++){
				for(int j=i+1;j<size;j++){
					if(arr[i]+arr[j] == target){
						m=arr[i];
						n=arr[j];
					}
				}
			}
			price[c][0]=m;
			price[c++][1]=n;
			test--;
			System.out.println();
		}
		for(int i=0;i<c;i++)
			System.out.println("Deepak should buy roses whose prices are "+price[i][0]+" and "+price[i][1]+".");
    }
}
