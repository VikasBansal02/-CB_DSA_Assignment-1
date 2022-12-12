import java.util.*;
public class Main
{
    
    public static void Recursion_Twins(String str,int count) {
	    if(str.length()>1){
	        if(str.length()==2){
		        System.out.println(count);
		        return;
	       }
	   }
	    char ch2   =str.charAt(2);
	    char ch1  =str.charAt(0);
	    String substring =str.substring(1);
	    if(ch1==ch2){
	    	count++;
	    }
	    Recursion_Twins(substring,count);
    }
    
    public static void main(String[] args) 
    {
	    Scanner scan=new Scanner(System.in);
	    String s=scan.next();
        Recursion_Twins(s,0);
	}
	
}
