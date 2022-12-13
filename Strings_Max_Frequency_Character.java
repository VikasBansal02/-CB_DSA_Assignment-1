import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Frequency_Character(str);

	}
	public static void Frequency_Character(String str) {
		int [] frq = new int [26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frq[ch-97]= frq[ch-97]+1;
		}
		
		int max_i=0;
		for (int i = 1; i < frq.length; i++) {
			if(frq[i]>frq[max_i]) {
				max_i=i;
			}
		}
		char ch = (char) (97+max_i);
		System.out.println(ch);	
	}
}
