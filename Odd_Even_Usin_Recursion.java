import java.util.*;
public class Main {

	public static void oddeven(int n){
        if(n==0)
            return;
        if(n%2 !=0){
            System.out.println(n);
        }
        oddeven(n-1);
        if(n%2 ==0){
            System.out.println(n);
        }
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		oddeven(num);
    }
}
