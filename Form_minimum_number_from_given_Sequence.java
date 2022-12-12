
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		
		while (test-- > 0) {
			
			int count_1 = 1;
			
			String str_1 = scan.next();
			
			int[] answer = new int[str_1.length() + 1];
			
			for (int x = 0; x <= str_1.length(); x++) {
				
				if (x == str_1.length() || str_1.charAt(x)=='I') {
					
					answer[x] = count_1;
					
					count_1++;

					for (int y = x - 1; y >= 0 && str_1.charAt(y) == 'D'; y--) {
                      
                      answer[y]=count_1;
                      
                      count_1++;
                      
					}
					
				}

			}
			
			for (int x = 0; x < answer.length; x++)
				System.out.print(answer[x]);
			
			System.out.println();
			
		}

	}

}
