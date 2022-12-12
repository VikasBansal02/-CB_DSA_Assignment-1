import java.util.*;
public class Main {
    
    public static void Recursion_Lexicographical_Order(int curr, int num) {
		if (curr > num) {
			return;
		}
		System.out.print(curr+" ");
		int x = 0;
		if (curr == 0) {
			x = 1;
		}
		while(x <= 9){
			Recursion_Lexicographical_Order(curr * 10 + x, num);
			x++;
		}
	}
    
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Recursion_Lexicographical_Order(0, num);

	}

}
