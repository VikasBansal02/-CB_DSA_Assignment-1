
import java.util.*;

public class Main {

	static String[] key = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
		String str_1 = scan.next();
		
		Smart_Keypad_I(str_1, "");

	}

	public static void Smart_Keypad_I(String question, String answer) {
		
		if(question.length()==0) {
			
			System.out.println(answer);
			return;
			
		}

		char ch_1 = question.charAt(0);
		
		String key_String = key[ch_1-48];
		
		for (int x = 0; x < key_String.length(); x++)
			Smart_Keypad_I(question.substring(1), answer+key_String.charAt(x));
		

	}

}
