
import java.util.*;

public class Main {
   
	public static void New_Permutation_vikas(String strvikas, int x, String ansvikas) {
		
		if(x==strvikas.length()) {
		    
			System.out.print(ansvikas + " ");
			return;
			
		}

		char chvikas = strvikas.charAt(x);
		
		if(chvikas >= 'a' && chvikas <= 'z')  {
			
			New_Permutation_vikas(strvikas, x+1, ansvikas + chvikas);
			
			chvikas = (char) (chvikas - 32);
			New_Permutation_vikas(strvikas, x+1, ansvikas + chvikas);
			
		}

		else if(chvikas >= 'A' && chvikas <= 'Z') {
			
			char smallchvikas = (char)(chvikas + 32);
			New_Permutation_vikas(strvikas, x+1, ansvikas + smallchvikas);
			New_Permutation_vikas(strvikas, x+1, ansvikas + chvikas);
		}
		else
			New_Permutation_vikas(strvikas, x+1, ansvikas + chvikas);
		
	}
	
	 public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String strvikas = scan.next();
		
		New_Permutation_vikas(strvikas, 0, "");

    }
    
}
