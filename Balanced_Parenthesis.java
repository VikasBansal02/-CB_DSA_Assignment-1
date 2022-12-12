
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str_1 = scan.next();

		if (is_Balanced(str_1))
			System.out.println("Yes");
		
		else
			System.out.println("No");

	}

	public static boolean is_Balanced(String str_1) {
	    
		Stack<Character> stack_1 = new Stack<>();
		
		for (int x = 0; x < str_1.length(); x++) {
		    
			char ch1 = str_1.charAt(x);
			
			if (ch1 == '(' || ch1 == '{' || ch1 == '[')
				stack_1.push(ch1);
			
			else {
				if (stack_1.isEmpty())
					return false;

				char top = stack_1.peek();
				
				if (ch1 == '}' && top == '{')
					stack_1.pop();
				
				else if (ch1 == ']' && top == '[')
					stack_1.pop();
				
				else if (ch1 == ')' && top == '(')
					stack_1.pop();
				
				else
					return false;
			
			    
			}

		}
		
		return stack_1.size() == 0;

	}

}
