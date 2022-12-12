import java.util.*;
public class Main {
    
    public static void Dictionary_Order_Smaller(String q, String answer, String org, ArrayList<String> list) {
		if (q.length() == 0) {
			if (answer.compareTo(org) < 0) {
				list.add(answer);
			}
			return;
		}

		for (int x = 0; x < q.length(); x++) {
			char c = q.charAt(x);
			String ros = q.substring(0, x) + q.substring(x + 1);
			Dictionary_Order_Smaller(ros, answer + c, org,list);

		}
		
	}
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        ArrayList<String> list = new ArrayList<>();
        Dictionary_Order_Smaller(str, "",str,list);
		Collections.sort(list);
		for (int x=0; x<list.size(); x++) 
			System.out.println(list.get(x));
			
		}

}
