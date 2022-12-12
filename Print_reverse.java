import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0;
		if(n%10==0){
			while(n>0){
				long rem=n%10;
				sum=sum*10+rem;
				n/=10;
			}
			String s=Integer.toString((int)sum);
			s="0"+s;
			sum=Integer.parseInt(s);
		}
		else{
			while(n>0){
				long rem=n%10;
				sum=sum*10+rem;
				n/=10;
			}
		}
		System.out.println(sum);
    }
}
