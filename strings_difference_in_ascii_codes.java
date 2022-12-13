import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Ascii_Codes(str);
	}
	
	public static void Ascii_Codes(String str) {
		String ans="";
		char prev= str.charAt(0);
		for (int i =1; i < str.length(); i++) {
			char curr= str.charAt(i);
			ans = ans + prev +(curr-prev);
		     prev=curr;
		
		}
		ans = ans + prev;
		System.out.println(ans);
		
		
	}
}
