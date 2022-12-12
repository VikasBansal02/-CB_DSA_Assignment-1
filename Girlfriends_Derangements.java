
import java.util.*;

public class Main {

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println(Girlfriends_Derangements(num));

	}

	public static int Girlfriends_Derangements(int num) {
		
        // Base cases
        if (num == 1)
            return 0;
        
        if (num == 2)
            return 1;

        return (num - 1) * (Girlfriends_Derangements(num - 1) + Girlfriends_Derangements(num - 2));

	}

}
