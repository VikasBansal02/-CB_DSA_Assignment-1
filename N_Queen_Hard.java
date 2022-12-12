import java.util.*;
public class Main {
    
    static int count=0;
    
    public static void Queen_hard(boolean board[][], int tq, int row)
    {
        if (tq == 0) 
        {
            count=count+1;
            return;
        }
        if (row >= board.length) {
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isitsafe(board,col,row)) {
                board[row][col] = true;
                Queen_hard(board, tq - 1, row + 1);
                board[row][col] = false;
           }

        }
    }
    
    public static boolean isitsafe(boolean [][]board,int col,int row) {
        int r= row;
        while (r>= 0) {
            if (board[r][col] ==true) {
                return false;
            }
            r--;
        }
        
        // col
        
        r= row;
        int c= col;
        while (r>= 0 && c>= 0) 
        {
            if (board[r][c]== true) 
            {
                return false;
            }

            r=r-1;
            c-=1;
        }
        
        // Left Diagonal
        
        r= row;
         c= col;
        while(r>=0 && c   <board[0].length) 
        {
            if (board[r][c]== true) {
                return false;
            }
            c+=1;
            r-=1;
        }
        
        // Right Diagonal
        
        return true;
    }
    
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        boolean [][]board= new boolean[num][num];
        Queen_hard(board, num, 0);
        System.out.println(count);
    }
    
    
}
