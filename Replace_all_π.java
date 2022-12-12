import java.util.*;

public class Main
{
    public static void Change(String str, int length,String ans){
        if(length==str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(length)=='p' && str.charAt(length+1)=='i'){
            // System.out.print(ans+3.14);
            Change(str,length+2,ans+3.14);
        }
        else
            Change(str,length+1,ans+str.charAt(length));
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		while(size>0){
		    String str=sc.next();
		    Change(str,0,"");
		    
		    size--;
		}
	}
}
