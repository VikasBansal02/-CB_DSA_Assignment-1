import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int n=num,c=0,temp=num;
		while(n>0){
			c++;
			n/=10;
		}
		int sum=0;
		while(temp>0){
			int rem=temp%10;
			sum+=Math.pow(rem,c);
			temp/=10;
		}
		if(num==sum)
			System.out.println(true);
		else
			System.out.println(false);
    }
}
