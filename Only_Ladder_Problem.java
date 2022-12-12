import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[] ladder_1 = ladders(size);
		
		System.out.println("\n"+Only_Ladder_Problem(size, 0, ladder_1, ""));

	}

	public static int  Only_Ladder_Problem(int size, int co, int[] ladder_2, String answer) {
		if (co == size) {
			
			System.out.print(answer + "END , ");
			
			return 1;
		}

		if (co > size)
			return 0;
		
		int c=0;
		if (ladder_2[co] != 0)
			c+=Only_Ladder_Problem(size, ladder_2[co], ladder_2, answer + co + " ");

		else {
			for (int dice = 1; dice <= 6; dice++)
				c+=Only_Ladder_Problem(size, co + dice, ladder_2, answer + co + " ");

		}
		
		return c;

	}

	public static int[] Prime_Seive(int size) {
	    
		int []prime_1 = new int[size + 1];
		
		Arrays.fill(prime_1, 1);
		
		prime_1[0] = 0;
		prime_1[1] = 0;
		
		for (int x = 2; x < prime_1.length; x++) {
			
			if (prime_1[x] == 1) {
			    
				for (int y = 2; y * x < prime_1.length; y++)
					prime_1[x * y] = 0;

			}

		}
		
		return prime_1;

	}

	public static int[] ladders(int size) {
	    
		int prime_1[] = Prime_Seive(size);
		
		int[] ladder_1 = new int[size + 1];
		
		int x = 0;
		
		int y = prime_1.length - 1;
		
		while (x < y) {
			
			while (prime_1[x] == 0)
				x++;
			
			while (prime_1[y] == 0)
				y--;

			if (x < y) {
				
				ladder_1[x] = y;
				
				x++;
				
				y--;
				
			}

		}
		
		return ladder_1;

	}

}
