import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		int flipa=perfectnessofastring(str,'b',k);
		int flipb=perfectnessofastring(str,'a',k);
		System.out.println(Math.max(flipa,flipb));		
    }
	public static int perfectnessofastring(String str, char ch,int k){
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<str.length()){
			if(str.charAt(ei)==ch){
				flip++;
			}
			while(flip>k){
				if(str.charAt(si)==ch){
					flip--;
				}
				si++;
			}
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}
}
