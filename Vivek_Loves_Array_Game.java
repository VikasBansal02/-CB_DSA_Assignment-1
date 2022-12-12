import java.util.*;
public class Main {
    
    public static int Vivek_Loves_Array_Game(int[] arr,int start,int end)
	{
	    
		for(int brk=start;brk<end;brk++)
		{
			int sum1=0;
			
			for(int i=start;i<=brk;i++)
				sum1+=arr[i];
			
			int sum2=0;
			
			for(int j=brk+1;j<=end;j++)
				sum2+=arr[j];
			
			if(sum1==sum2)
			{
				int leftgame=Vivek_Loves_Array_Game(arr,start,brk);
				int rightgame=Vivek_Loves_Array_Game(arr,brk+1,end);
				return Math.max(leftgame,rightgame)+1;
			}
		}
		
		return 0;
		
	}
    
    public static void main(String args[]) {
        
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		
		while(test>0)
		{
			int num=scan.nextInt();
			int[] Vivek_arr=new int[num];
			int z=Vivek_arr.length;
			for (int j= 0;j<z;j++) 
			{
				Vivek_arr[j]=scan.nextInt();
			}
			System.out.println(Vivek_Loves_Array_Game(Vivek_arr,0, num- 1));
			test--;
		}
		
    }
	
}
