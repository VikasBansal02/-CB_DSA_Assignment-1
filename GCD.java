import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong();
		long n2=sc.nextLong();
		while(n2!=0){
			long temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println(n1);
    }
}
