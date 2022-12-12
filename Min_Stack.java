import java.util.*;

public class Main {
    
	static Stack<Integer> stackvikas = new Stack<>();
    
	private static int get_Min_vikas()
	{
		Stack<Integer> tempvikas = new Stack<>();
		
		int minvikas = Integer.MAX_VALUE;
		
		while(!stackvikas.isEmpty())
		{
			
			int xvikas=stackvikas.pop();
			
			if(xvikas<minvikas)
				minvikas=xvikas;
			
			tempvikas.push(xvikas);
			
		}
		
		while(!tempvikas.isEmpty())
		{
			int xvikas=tempvikas.pop();
			stackvikas.push(xvikas);
		}
		
		return minvikas;
		
	}
	
	public static void main (String args[]) {
	    
		Scanner scan=new Scanner(System.in);
		
		int nvikas = scan.nextInt();
		
		String strvikas[]=new String[nvikas];
		
		for(int x=0;x<nvikas;x++)
			strvikas[x]=scan.next();
		
		for(int x=0;x<nvikas;x++)
		{
		    
			if(strvikas[x].equals("push"))
			{
				int xvikas=scan.nextInt();
				stackvikas.push(xvikas);
			}
			
			else if(strvikas[x].equals("pop"))
			{
			    
				if(!stackvikas.isEmpty())
					stackvikas.pop();
				
			}
			
			else if(strvikas[x].equals("top"))
			{
			    
				if(!stackvikas.isEmpty())
					System.out.print(stackvikas.peek()+" ");
				
			}
			
			else if(strvikas[x].equals("getMin"))
			{
			    
				if(!stackvikas.isEmpty())
					System.out.print(get_Min_vikas()+" ");
				
			}
			
		}
		
    }
	
}
