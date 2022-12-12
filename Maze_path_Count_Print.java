import java.util.*;
public class Main {
    
    static int count = 0;
    
    public static void Maze_path_Count_Print(int er, int ec, String ans, int cr, int cc) {
		// er = end row, ec=end column , cc = current column ,cr =current row
		if (cc == ec && cr == er) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}
        
        Maze_path_Count_Print(er, ec, ans + "V", cr + 1, cc);
	    Maze_path_Count_Print(er, ec, ans + "H", cr, cc + 1);

	}
    
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(); // Number of rows
		int n = scan.nextInt(); // Number of Columns
		Maze_path_Count_Print(m - 1, n - 1, "", 0, 0);
		System.out.println("\n"+count);

	}

}
