import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num,con=0,c=1;;
		while(temp>0){
			int rem=temp%8;
			con=con+rem*c;
			c*=10;
			temp/=8;
		}
		System.out.println(con);
    }
}
