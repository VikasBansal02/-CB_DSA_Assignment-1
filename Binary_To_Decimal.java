import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int c=0,sum=0;
		while(num>0){
			int rem=num%10;
			sum+=(int)rem * Math.pow(2,c);
			num/=10;
			c++;
		}
		System.out.println(sum);
    }
}
