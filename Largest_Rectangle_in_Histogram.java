import java.util.*;
public class Main {
    
    public static void main (String args[]) {
        
        Scanner scan  = new Scanner(System.in);
        
        int NoH = scan.nextInt();
        
        int []sizeH = new int[NoH];
        
        for(int x=0;x<NoH;x++)
            sizeH[x]=scan.nextInt();
        
        System.out.println(HArea(sizeH));

    }
    public static int HArea(int[] arr) {

		Stack<Integer> st1 = new Stack<>();
		
        int max_area = 0;
		
        for (int x = 0; x < arr.length; x++) {
			
            while (!st1.isEmpty() && arr[x] < arr[st1.peek()]) {
				
                int he = arr[st1.pop()];
				int res = x;
				
                if (st1.isEmpty())
					max_area = Math.max(max_area, he * res);

                else {

					int l = st1.peek();

					max_area = Math.max(max_area, he * (res - l - 1));

				}
			}

			st1.push(x);
		
        }

		int res = arr.length;

		while (!st1.isEmpty()) {
			
            int he = arr[st1.pop()];

			if (st1.isEmpty())
				max_area = Math.max(max_area, he * res);
			
            else {

				int l = st1.peek();

				max_area = Math.max(max_area, he * (res - l - 1));

			}

		}

		return max_area;

	}

}
