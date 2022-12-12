import java.util.*;;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int []arr_1 = new int[size];
		
		for(int x=0;x<size;x++)
		    arr_1[x]=scan.nextInt();
		
		Stock_Span_1(arr_1);

	}

	public static void Stock_Span_1(int[] arr_1) {
		
		int[] span_1 = new int[arr_1.length];
		
		Stack<Integer> st1 = new Stack<>();

		for (int x = 0; x < arr_1.length; x++) {
			
			while (!st1.isEmpty() && arr_1[x] > arr_1[st1.peek()])
				st1.pop();

			if (st1.isEmpty())
				span_1[x] = x + 1;
			
			else
				span_1[x] = x - st1.peek();
			
			st1.push(x);

		}
		
		for (int x = 0; x < span_1.length; x++)
			System.out.print(span_1[x]+" ");

		System.out.println("END");

	}

}
