import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		// int count=count(n);
		int c=1, sodd=0,seven=0;
		while(n>0){
			int r=(int)n%10;
			if(c%2!=0){
				sodd+=r;
			}
			else
				seven+=r;
			c++;
			n/=10;
		}
		System.out.print(sodd+"\n"+seven);
    }
}
