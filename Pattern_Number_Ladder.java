import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,c=1;
		while(row<=n){
			int j=1;
			while(j<=row){
				System.out.print(c+"\t");
				j++;
				c++;
			}
			row++;
			System.out.println();
		}
    }
}
