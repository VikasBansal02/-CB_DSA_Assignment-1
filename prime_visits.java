import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean[] primes = new boolean[10000000];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for(int i = 2; i < primes.length; i++) {
			if(primes[i]) {
				primes[i] = true;
				for(int j = 2; j * i < primes.length; j++) {
					primes[j * i] = false;
				}
			}
		}
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 0;
			for(int i = a; i <= b; i++) {
				if(primes[i]) ans += 1;
			}
			System.out.println(ans);
		}
    }
}
