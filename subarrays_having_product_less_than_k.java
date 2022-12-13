import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int k = scan.nextInt();
        int []arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();
        System.out.println(numSubarrayProductLessThanK(arr,k));
    }

    public static int numSubarrayProductLessThanK(int[] arr, int k) {
		int ans = 0;
		int si = 0;
		int ei = 0;
		int mul = 1;
		while (ei < arr.length) {
			mul *= arr[ei];// window me  new ele add hua

			// mul>=k

			while (mul >= k && si <= ei) {
				mul /= arr[si];
				si++;

			}

			ans += (ei - si + 1);// wimdow size
			ei++;
		}
		return ans;
	}
}