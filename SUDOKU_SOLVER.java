import java.util.*;
public class Main{
    
    public static boolean isitpossible(int[][] grid, int row, int col, int val) {
		
		// row
		int c = 0;
		while (c < 9) {
			if (grid[row][c] == val) {
				return false;
			}
			c++;
		}

		// col
		int r = 0;
		while (r < 9) {
			if (grid[r][col] == val) {
				return false;
			}
			r++;
		}

		// 3*3 Matrix
		r = row - row % 3;
		c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}

			}

		}

		return true;
	}
    
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int[][] grid = new int[num][num];
		for(int x=0;x<num;x++){
		    for(int y=0;y<num;y++)
		        grid[x][y]=scan.nextInt();
		}

		SUDOKU_SOLVER(grid, 0, 0);

	}
	
	public static void Display(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();

		}

	}

	public static void SUDOKU_SOLVER(int[][] grid, int row, int col) {
		
		if (col == 9) {
			row++;
			col = 0;
		}
		
		if (row == 9) {
			Display(grid);
			return;
		}

		if (grid[row][col] != 0)
			SUDOKU_SOLVER(grid, row, col + 1);
		
		else {

			for (int val = 1; val <= 9; val++) {
			    
				if (isitpossible(grid, row, col, val) == true) {

					grid[row][col] = val;
					SUDOKU_SOLVER(grid, row, col + 1);
					grid[row][col] = 0;// undo

				}

			}

		}

	}
    
}
