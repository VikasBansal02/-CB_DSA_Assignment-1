import java.util.*;
public class Main {

	public static boolean isPalindrome(String str){

		// str=str.toLowerCase();

		String str1 = "";
		for(int i=str.length()-1;i>=0;i--){
			str1+=str.charAt(i);
		}

		if(str.equals(str1)){
			return true;
		}

		return false;
	}

    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isPalindrome(str));
    }
}
