import java.util.*;
public class Main {
    
	static String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };
	static int c1=0;
	
	public static void Recursion_Keypad_Codes(String ans,String str)
	{
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			c1++;
			return;
		}
		char ch=str.charAt(0);
		int pos = ch - '0';
		
		String key = arr[pos];
		
		for (int z= 0; z<key.length();z++)
			Recursion_Keypad_Codes(ans + key.charAt(z),str.substring(1));
		
	}
	
	public static void main(String args[]) {
	    
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		String str_123=String.valueOf(num);
		Recursion_Keypad_Codes("",str_123);
		System.out.println("\n"+c1);
    }
	
}
