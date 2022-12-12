import java.util.*;
public class Main {
    
    public static void Tower_of_Hanoi(int num, String s, String help, String d) {
	    
		if (num == 0) {
			return;
		}
		Tower_of_Hanoi(num - 1, s, d, help);
		
		System.out.println("Moving ring " + num + " from " + s + " to " + d);

		Tower_of_Hanoi(num - 1, help, s, d);
	}
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String s = "A";
		String help = "C";
		String d = "B";
		Tower_of_Hanoi(num, s, help, d);

	}

}
