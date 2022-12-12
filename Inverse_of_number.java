import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=0,c=1;
		while(n>0){
			int rem = n%10;
			num=num+c*(int)Math.pow(10,rem-1);
			c++;
			n/=10;
		}
		System.out.println(num);

    }
}
