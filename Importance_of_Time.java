
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[] call_1 = new int[size];
		
		int[] ideal_1 = new int[size];
		
		for (int y = 0; y < call_1.length; y++)
			call_1[y] = scan.nextInt();
		
		for (int x = 0; x < ideal_1.length; x++)
			ideal_1[x] = scan.nextInt();
		
		System.out.println(Importance_of_Time(call_1, ideal_1));

	}

	public static int Importance_of_Time(int[] call_1, int[] ideal_1) {
		
		int t_1 = 0;
		
		Queue<Integer> q_1 = new LinkedList<>();
		
		Queue<Integer> q_2 = new LinkedList<>();
		
		for (int x = 0; x < call_1.length; x++)
			q_1.add(call_1[x]);
		
		for (int x = 0; x < ideal_1.length; x++)
			q_2.add(ideal_1[x]);
		
		while (!q_1.isEmpty()) {
		    
			if (q_1.peek() == q_2.peek()) {
				
				t_1++;
				
				q_1.poll();
				
				q_2.poll();
				
			}
			else {
				
				int ii = q_1.poll();
				
				q_1.add(ii);
				
				t_1++;
				
			}

		}
		return t_1;
	}

}
