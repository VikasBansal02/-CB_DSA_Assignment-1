
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        
        int []arr1 = new int[size];
        
        for(int x=0;x<size;x++)
            arr1[x]=scan.nextInt();
        
		next_greater_ele(arr1);

	}

	public static void next_greater_ele(int[] nums) {
		
		int[] res = new int[nums.length];
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 2 * nums.length - 1; i >= 0; --i) {
            
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length])
                stack.pop();
            
            res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            
            stack.push(i % nums.length);
            
        }
		
		for (int x = 0; x < res.length; x++)
			System.out.print(res[x]+" ");
		
	}

}
