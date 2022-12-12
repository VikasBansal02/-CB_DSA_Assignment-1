import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int d=sc.nextInt();
		int c=count(n,d);
		System.out.println(c);
    }
	public static int count(long num,int d){
		int c=0;
		while(num>0){
			int r=(int)num%10;
			if(r==d)
				c++;
			num/=10;
		}
		return c;
	}
}
