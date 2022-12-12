import java.util.*;
public class Main 
{
    static int count=0;
    
    public static void Mazepath_D_Count_Print(int row,int col,int endrow,int endcol,String ans)
    {
        
        if(row==endrow && col==endcol)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        
        if(row>endrow || col>endcol)
            return;
    
        Mazepath_D_Count_Print(row+1,col,endrow,endcol,ans+"V");
        
        Mazepath_D_Count_Print(row,col+1,endrow,endcol,ans+"H");
        
        Mazepath_D_Count_Print(row+1,col+1,endrow,endcol,ans+"D");
        
    }
    
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        Mazepath_D_Count_Print(0,0,num1-1,num2-1,"");
        System.out.println("\n"+count);
    }
    
}
