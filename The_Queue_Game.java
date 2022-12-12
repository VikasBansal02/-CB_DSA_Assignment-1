
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		
		while(test-- > 0) {
		    
			int size = scan.nextInt();
			
			int [] arr1 = new int [size];
			
			for (int x = 0; x < arr1.length; x++)
				arr1[x]=scan.nextInt();
			
			if(The_Queue_Game(arr1))
				System.out.println("Valid");
			
			else
				System.out.println("Invalid");
			
		}
		

	}
	
	public static boolean The_Queue_Game(int [] arr1) {
		
		LinkedList<Integer> list_1 = new LinkedList<>();
		
		for (int x = 0; x < arr1.length; x++) {
			
			if(arr1[x] == 1)
				list_1.add(1);
			
			else {
			    
				if(list_1.isEmpty())
					return false;
				
				else
					list_1.remove();
				
			}
			
		}
		
		return true;
		
	}

}
