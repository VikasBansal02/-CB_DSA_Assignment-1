import java.util.*;
public class Main {
    
    public static boolean flag=false;
    
    public static void Rat_in_a_maze(char maze_matrix[][], int cc, int cr,int ans[][]){
        // cc- Current column; cr- Current row
        if(cr== maze_matrix.length-1 && cc==maze_matrix[0].length-1 && maze_matrix[cr][cc]!='X'){
            
            ans[cr][cc]=1;
            Display(ans);
            flag=true;
            return;
        }
        
        if(cr<0 ||cc<0 || cr>=maze_matrix.length ||cc>=maze_matrix[0].length ||maze_matrix[cr][cc]=='X')
            return;
        
        if(flag==false){
            
            maze_matrix[cr][cc]='X';
            ans[cr][cc]=1;
            Rat_in_a_maze(maze_matrix,cc+1,cr,ans);
        	Rat_in_a_maze(maze_matrix,cc,cr+1,ans);

            maze_matrix[cr][cc]='O';
            ans[cr][cc]=0;
        
        }
        
    }
    
  
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        char maze_matrix[][] = new char[n][m];
        
        for (int x= 0; x<maze_matrix.length; x++){
            
            String str = scan.next();
            for (int y= 0; y< str.length(); y++)
                maze_matrix[x][y]=str.charAt(y);
        
        }
        
        int  ans[][]=new int[n][m];
        
        Rat_in_a_maze(maze_matrix,0,0,ans);
        
        if(flag==false)
            System.out.println(-1);
        
    }
    
    public static void Display(int ans[][]){
        
        for (int i = 0; i < ans.length; i++) {
            
            for (int j = 0; j <ans[0].length ; j++)
                System.out.print(ans[i][j]+" ");
            
            System.out.println();
        }
        
    }

}
