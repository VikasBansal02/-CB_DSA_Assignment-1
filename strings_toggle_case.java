import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Toggle(str);

	}

	public static void Toggle(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ans = ans + (char)(ch+32);
			}
			else {
				ans = ans + (char)(ch-32);
			}

		}
		System.out.println(ans);
	}
}
