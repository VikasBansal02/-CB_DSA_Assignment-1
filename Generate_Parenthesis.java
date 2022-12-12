import java.util.*;
public class Main {

    public static void Generate_Parenthesis(int num, int open, int close, String answer) {
		if (open == num && close == num) {
			System.out.println(answer+"");
			return;
		}
		if (close < open) {
			Generate_Parenthesis(num, open, close + 1, answer + ")");
		}
		if (open < num) {
			Generate_Parenthesis(num, open + 1, close, answer + "(");
		}
		

	}
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Generate_Parenthesis(num, 0, 0, "");
	}

}
