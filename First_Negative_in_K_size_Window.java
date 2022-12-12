
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		
		while(test-->0){
		    
		    int size = scan.nextInt();
		    
		    int w_size = scan.nextInt();
		    
		    int []arr1 = new int[size];
		    
		    for(int x=0;x<size;x++)
		        arr1[x]=scan.nextInt();
		    
		    First_Negative_in_K_size_Window(arr1, w_size);

			System.out.println();
		    
		}

	}

	public static void First_Negative_in_K_size_Window(int[] arr1, int w_size) {
		
		Queue<Integer> q1 = new LinkedList<>();
		
		for (int x = 0; x < w_size && x < arr1.length; x++) {
			
			if (arr1[x] < 0)
				q1.add(x);
			
		}
		
		if (q1.isEmpty())
			System.out.print(0+" ");
		
		else
			System.out.print(arr1[q1.peek()]+" ");
		
		for (int x = w_size; x < arr1.length; x++) {
			
			if (!q1.isEmpty() && q1.peek() == x - w_size)
				q1.remove();
			
			if (arr1[x] < 0)
				q1.add(x);

			if (q1.isEmpty())
				System.out.print(0+" ");
			
			else
				System.out.print(arr1[q1.peek()]+" ");
			

		}

	}

}
