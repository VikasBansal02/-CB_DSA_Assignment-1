
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		int q1 = scan.nextInt();
		
		Stack<Integer> st1 = new Stack<>();
		
		for (int x = 0; x < n1; x++)
			st1.push(scan.nextInt());
		
		Playing_with_cards_1(st1, q1);

	}

	public static void Playing_with_cards_1(Stack<Integer> st1, int q1) {
		
		Stack<Integer> A1 = new Stack<>();
		
		Stack<Integer> B1 = new Stack<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		find_Primes1(list1);

		for (int y = 1; y <= q1; y++) {
			
			int p1 = list1.get(y - 1);
			
			while (!st1.isEmpty()) {
				
				int ii = st1.pop();
				
				if (ii % p1 == 0)
					B1.push(ii);
				
				else
					A1.push(ii);

			}

			while (!B1.isEmpty())
				System.out.println(B1.pop());

			st1 = A1;
			A1 = new Stack<>();

		}
		while (!st1.isEmpty())
			System.out.println(st1.pop());

	}

	public static void find_Primes1(ArrayList<Integer> primes1) {
		
		boolean[] prime1 = new boolean[100001];
		
		prime1[0] = true;
		
		prime1[1] = true;
		
		for (int x = 2; x * x <= 100000; x++) {
			
			if (prime1[x] == false) {
				
				primes1.add(x);
				
				for (int mul = 2; mul * x <= 100000; mul++) 
					prime1[x * mul] = true;
	
			}
		}
		
		for (int y = 2; y <= 100000; y++) {
			
			if (!prime1[y]) 
				primes1.add(y);
			
		}
	}

}
