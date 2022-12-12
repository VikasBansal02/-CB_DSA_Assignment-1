import java.util.*;
public class Main{
    
    static boolean f=false;
    
    public static void Rat_Chases_its_cheese(int ans[][],char maze[][], int cc, int cr){
        if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X'){
            ans[cr][cc] = 1;
            Display(ans);
            f= true;
            return;
        }
        if (cr < 0 || cc < 0||cr >=maze.length|| cc>=maze[0].length||maze[cr][cc]=='X')
            return;
        
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        int r[]={ -1, 1, 0, 0 };
        int c[]={ 0, 0, -1, 1 };
        
        Rat_Chases_its_cheese(ans,maze, cc, cr - 1);
        
        Rat_Chases_its_cheese(ans,maze, cc, cr + 1);
        
        Rat_Chases_its_cheese(ans,maze, cc - 1, cr);
        
        // left
        Rat_Chases_its_cheese(ans,maze, cc + 1, cr);
        
        // right
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
        
    }
    
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        char [][]maze=new char[n][m];
        for (int i = 0; i<maze.length;i++) {
            
            String str=scan.next();
            for (int x=0; x<str.length();x++) 
                maze[i][x]=str.charAt(x);
            
        }
        
        int[][] ans= new int[n][m];
        
        Rat_Chases_its_cheese(ans,maze,0, 0);
        
        if (f==false) {
            System.out.println("NO PATH FOUND");
        }
    }
    public static void Display(int ans[][]) {
        for (int i = 0; i <ans.length;i++){
            for (int j = 0; j <ans[0].length; j++) {
            System.out.print(ans[i][j] + " ");
            }
        System.out.println();
        }
    }
    
}
