import java.util.*;
public class Main {
    public static String compressString(String str1)
	{
		char ch[]=new char[str1.length()];
		int c=1;
		String str="";
		for(int i=0;i<str1.length()-1;i++){
			if(str1.charAt(i)==str1.charAt(i+1))
			{
				c++;
			}
			else{
				if(c>1){
					str+=str1.charAt(i);
					str+=Integer.toString(c);
				}
				else{
					str+=str1.charAt(i);
				}
				c=1;
			}
		}
		if(c>1){
			str+=str1.charAt(str1.length()-1);
			str+=Integer.toString(c);
		}
		else
			str+=str1.charAt(str1.length()-1);
		
		return str;
	}
    public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		String str1=scan.next();
		System.out.println(compressString(str1));

    }

}