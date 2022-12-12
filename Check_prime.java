import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		boolean prime=true;
		for(long i=2;i<=n/2;i++){
			if(n%i==0){
				prime=false;
				break;
			}
		}
		if(n==1){
			System.out.println("Not Prime");
		}
		else if(prime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
    }
}
