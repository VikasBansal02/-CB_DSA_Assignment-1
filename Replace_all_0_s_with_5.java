import java.util.*;

public class Main
{
    public static void Convert(int n){
        if(n==0)
            return;
        Convert(n/10);
        if(n%10 ==0){
            System.out.print(5);
        }
        else
            System.out.print(n%10);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Convert(num);
		
	}
}
