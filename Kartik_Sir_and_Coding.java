
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> stack1 = new Stack<>();
		
		int n1 = scan.nextInt();
		
		for (int x = 0; x < n1; x++) {
		    
			int e_1 = scan.nextInt();
			
			if(e_1 == 2) {
				
				int item1 = scan.nextInt();
				
				stack1.push(item1);
			}
			
			else {
				if(stack1.isEmpty())
					System.out.println("No Code");
	
				else
					System.out.println(stack1.pop());
				
			}
			
		
		    
		 
		}

	
	    
	}

}
