import java.util.*;
public class Main{
    
    static int count=0;
    
    public static void N_Knight_Problem(boolean [][]board,int row,int col,int tn,String ans) {
        
        if (tn==0) {
            
            System.out.print(ans + " ");
            count++;
            return;
        }
        
        if (col ==board.length){
            
            row+=1;
            col =0;
        }
        
        if (row ==board.length)
            return;
        
        
        if (isitsafe(board,col, row)) {
            
            board[row][col] = true;
            N_Knight_Problem(board, row, col + 1, tn - 1,ans + "{" + row + "-" + col + "} ");
            board[row][col] = false;
        }
        
        N_Knight_Problem(board, row, col + 1, tn,ans);
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean [][]board= new boolean[num][num];
        N_Knight_Problem(board, 0, 0, num,"");
        System.out.println("\n"+count);
    }
    
    public static boolean isitsafe(boolean[][] board,int col,int row) {
        int c[] = { 2,-2,1,-1 };
        int r[] = {-1,-1,-2, -2 };
        for (int x1= 0; x1< c.length; x1++){
            int y=col+c[x1];
            int x=row+r[x1];
            if (x>= 0 && y>= 0 && y< board.length && board[x][y]== true){
                return false;
            }
        }
        return true;
    }
    
}
