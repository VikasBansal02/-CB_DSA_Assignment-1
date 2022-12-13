import java.util.*;
public class Main {

	public static int Count_Palindromic_Substrings(String str){
		StringBuilder str1=new StringBuilder("");
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1 ; j<=str.length(); j++){

			    str1.append(str.substring(i , j));
			    String lm=str1.toString();
			    String sm=(str1.reverse()).toString();
			    if(lm.equals(sm))
				    count++;
			    str1.setLength(0);
		    }
		}
		return count;
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(Count_Palindromic_Substrings(str));
    }
}