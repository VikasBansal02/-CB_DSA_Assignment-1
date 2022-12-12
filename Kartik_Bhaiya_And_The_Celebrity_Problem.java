
import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[][] arr1 = new int[size][size];
		
		for (int x = 0; x<size; x++) {
			
			for (int y = 0; y < size; y++)
				arr1[x][y] = scan.nextInt();

		}
		
		int answer = Kartik_Bhaiya_And_The_Celebrity_Problem(arr1, size);
		
		if (answer == -1)
			System.out.println("No Celebrity");
		
		else
			System.out.println(answer);

	}

	public static int Kartik_Bhaiya_And_The_Celebrity_Problem(int[][] arr1, int size) {
		
		Stack<Integer> st1 = new Stack<>();
		
		for (int x = 0; x < size; x++)
			st1.push(x);

		while (st1.size() > 1) {
			
			int a1 = st1.pop();
			
			int b1 = st1.pop();
			
			if (arr1[a1][b1] == 1)
				st1.push(b1);
			
		    else
				st1.push(a1);

		}
		
		int Celebrity_C = st1.pop();
		
		for (int x = 0; x < arr1.length; x++) {
			
			if (x == Celebrity_C)
				continue;
			
			if (arr1[Celebrity_C][x] == 1 || arr1[x][Celebrity_C] == 0)
				return -1;
			
		}

		return Celebrity_C;

	}

}
