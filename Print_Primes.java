import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++){
			boolean prime=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					prime=false;
					break;
				}
			}
			if(prime)
				System.out.println(i);
		}
    }
}
