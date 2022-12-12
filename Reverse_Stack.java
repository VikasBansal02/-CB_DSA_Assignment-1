import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		Stack<Integer> st1 = new Stack<>();

        for(int x=0;x<size;x++)
            st1.push(scan.nextInt());
        
// 		System.out.println(st1);
		Reverse_Stack(st1);
		
// 		System.out.println(st1);
        for(int x = st1.size()-1;x>=0;x--)
            System.out.println(st1.get(x));

	}

	public static void Reverse_Stack(Stack<Integer> st1) {
		if (st1.isEmpty())
			return;
			
		int item = st1.pop();
		
		Reverse_Stack(st1);
		
		Insert_Down(st1, item);

	}

	public static void Insert_Down(Stack<Integer> st1, int item1) {
		
		if (st1.isEmpty()) {
			
			st1.push(item1);
			
			return;
		}
		
		int ii = st1.pop();
		
		Insert_Down(st1, item1);
		
		st1.push(ii);

	}

}
