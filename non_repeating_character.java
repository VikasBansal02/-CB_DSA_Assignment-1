import java.util.*;
public class Main {
    public static String repeat(String str)
	{
		int ch[]=new int[123];
		if(str.length()==0)
			return "-1";
		if(str.length()==1)
			return str;
		String str1="";
		for(int x=0;x<str.length();x++)
			ch[(int)(str.charAt(x))]++;
		
		for(int x=0;x<str.length();x++)
		{
			if(ch[(int)(str.charAt(x))]==1){
				str1+=str.charAt(x);
				return str1;
			}
		}
		return "-1";
	}
    public static void main(String args[]) {

		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int x=0;x<test;x++){
			String str=scan.next();
			System.out.println(repeat(str));
		}
    }

}Snon