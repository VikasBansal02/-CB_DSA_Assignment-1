import java.util.Scanner;
public class Main {
    
    public static int chess_board(int num, int er, int ec, String ans, int cr, int cc) {
        if (cc == ec && cr == er) {
            System.out.print(ans + "{" + cr + "-" + cc + "} ");
            return 1;
        }
        if (cc >= num || cr >= num) {
            return 0;
        }
        int c=0;
        c+=chess_board(num, er, ec,  ans + "{" + cr + "-" + cc + "}K", cr + 2, cc + 1);
        c+=chess_board(num, er, ec, ans + "{" + cr + "-" + cc + "}K", cr + 1,  cc + 2);
        if (cc == 0 || cr == 0 || cc == num - 1 || cr == num - 1) {
            for (int x = 1; x <= er; x++) {
                c+=chess_board(num, er, ec, ans + "{" + cr + "-" + cc + "}R", cr, cc + x);
            }
            for (int y = 1; y <= er; y++) {
                c+=chess_board(num, er, ec, ans + "{" + cr + "-" + cc + "}R", cr + y, cc);
            }
		}
		if (cc == cr || cc + cr == er) {
			for (int x = 1; x <= er; x++) {
				c+=chess_board(num, er, ec, ans + "{" + cr + "-" + cc + "}B", cr + x, cc + x);
			}
		}
		return c;
	}
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("\n" + chess_board(num, num - 1, num - 1, "", 0, 0));
    }
    
}
