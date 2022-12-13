import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
		String s = scan.next();
		Remove_duplicate(s.substring(1),s.substring(0, 1));
    }

	public static void Remove_duplicate(String Ques, String ans) {
		if(Ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char last_ans=ans.charAt(ans.length()-1);
		char first_Ques=Ques.charAt(0);
		if(last_ans==first_Ques) {
			Remove_duplicate(Ques.substring(1), ans);
		}
		else {
			Remove_duplicate(Ques.substring(1), ans+first_Ques);
		}
		
	}
}
SS