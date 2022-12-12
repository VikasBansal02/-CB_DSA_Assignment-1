import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int interval=sc.nextInt();
		while(min<=max){
			int c=(int)((5.0/9)*(min-32));
			System.out.println(min+" "+c);
			min+=interval;
	
		}

    }
}
