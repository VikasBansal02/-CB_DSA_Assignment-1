import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int sb = sc.nextInt(),db = sc.nextInt(),n = sc.nextInt();
		int x=n,sum=0,i=0;
		while(x>0){
			int res=x%10;
			sum=sum+res*(int)Math.pow(sb,i);
			i++;
			x=x/10;
		}
		int con=0,j=1;
		// int z=0;
		// int arr[]=new int[100];
		while(sum>0){
			int res=sum%db;
			// arr[z]=res;
			// z++;
			con=con+res*j;
			j*=10;
			sum=sum/db;
		}
		System.out.println(con);
		// for(int j=z-1;j>=0;j--){
		// 	System.out.print(arr[j]);
			
		// }
    }
}
