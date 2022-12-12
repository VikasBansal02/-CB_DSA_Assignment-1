import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int c=1,n=1;
		while(c<=n1){
			int r=3*n+2;
			if(r%n2!=0){
				c++;
				System.out.println(r);
				n++;
				continue;
			}
			n++;

		}
    }
}
