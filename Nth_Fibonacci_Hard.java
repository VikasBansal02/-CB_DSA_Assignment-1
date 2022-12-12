import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		while(n>1){
			int c=a+b;
			a=b;
			b=c;
			n--;
		}
		if(n==1)
			System.out.println(b);
		else
			System.out.println(b);
    }
}
