
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str_1 = scan.next();
		
        Mapped_String(str_1, "");
        
	}

	public static void Mapped_String(String question, String answer) {
		
		if (question.length() == 0) {
			
			System.out.println(answer);
			return;
			
		}
		
		String s_1 = question.substring(0, 1);
		
		int n_1 = Integer.parseInt(s_1);
		
		Mapped_String(question.substring(1), answer + (char) (64 + n_1));
		
		if (question.length() >= 2) {
			
			s_1 = question.substring(0, 2);
			
			n_1 = Integer.parseInt(s_1);
			
			if (n_1 <= 26)
				Mapped_String(question.substring(2), answer + (char) (64 + n_1));
			
		}
		
	}

}
