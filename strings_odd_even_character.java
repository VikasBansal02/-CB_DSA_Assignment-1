import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Odd_EvenCharacter(str);

	}
	public static void  Odd_EvenCharacter(String str) {
		String ans="";
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if(i%2==0) {
				ans = ans + (char)(ch+1);
			}
			else {
				ans = ans + (char)(ch-1);
			}
			
		}
		System.out.println(ans);
		
	}
}
