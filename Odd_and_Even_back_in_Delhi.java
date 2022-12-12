import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextLong();
		for(int i=0;i<n;i++){
			long a=arr[i],sodd=0,seven=0;
			while(a>0){
				long r=a%10;
				if(r%2==0)
					seven+=r;
				else
					sodd+=r;
				a/=10;
			}
// 			System.out.println(sodd+" "+seven);
			if(seven%4==0 || sodd%3==0)
				System.out.println("Yes");
			else{
				System.out.println("No");
			}
		}
    }
}
