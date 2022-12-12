import java.util.*;

public class Main
{
	//2nd Way 
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str=sc.next();
        System.out.println("\n"+printpermutation(str,""));
	}
	
	public static int printpermutation(String ques,String ans){
	    if(ques.length()==0){
	        System.out.print(ans + " ");
			return 1;
	    }
	    char ch=ques.charAt(0);
	    int f1=printpermutation(ques.substring(1),ans);
	    int f2=printpermutation(ques.substring(1),ans+ch);
		return f1+f2;
	}
}
