
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test-->0){
            
            int size = scan.nextInt();
        
            int []arr1 = new int[size];
        
            for(int x=0;x<size;x++)
                arr1[x]=scan.nextInt();
		    
		    next_greater_ele(arr1);
        }

	}

	public static void next_greater_ele(int[] arr1) {
		
		int[] answer = new int[arr1.length];
		
		Stack<Integer> s1 = new Stack<>();
		
		for (int y = 0; y < arr1.length; y++) {
			
			while (!s1.isEmpty() && arr1[y] > arr1[s1.peek()])
				answer[s1.pop()] = arr1[y];
			
			s1.push(y);
			
		}
		while (!s1.isEmpty())
			answer[s1.pop()] = -1;
		
		for (int x = 0; x < answer.length; x++)
			System.out.println(arr1[x] + "," + answer[x]);
		
	}

}
