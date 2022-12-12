import java.util.*;
public class Main
{
    
    public static int Boardpath_Count_Print(int end, int curr, String ans,int m) {
		if (curr == end) {
		    
			System.out.print(ans + " ");
			return 1;
		}
		
		if (curr > end)
			return 0;
		
		int count = 0;
		
		for (int dice = 1; dice <= m; dice++)
			count = count + Boardpath_Count_Print(end, curr + dice, ans + dice,m);

		return count;

	}
    
	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();//size of the board
		int m = scan.nextInt();//number of the faces of a dice
		
		System.out.println("\n" + Boardpath_Count_Print(n, 0, "",m));

	}

}
