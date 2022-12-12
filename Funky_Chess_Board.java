import java.util.*;

public class Main 
{
    
	public static int min_vikas(int[][] chessvikas,int nvikas,int rvikas,int cvikas){
	    
		if(rvikas>=nvikas || rvikas<0 || cvikas>=nvikas || cvikas<0 || chessvikas[rvikas][cvikas]==-1 || chessvikas[rvikas][cvikas]==0){
			
			int vikas=0;
			
			for(int x=0;x<nvikas;x++){
			    
				for(int y=0;y<nvikas;y++){
				    
					if(chessvikas[x][y] == 1)
						vikas++;
					
				}
			}
			
			return vikas;
		}
		
		int[] mvikas = new int[8];
		chessvikas[rvikas][cvikas]=-1;
		
		mvikas[0]=min_vikas(chessvikas,nvikas,rvikas-2,cvikas+1);
		
		mvikas[1]=min_vikas(chessvikas,nvikas,rvikas-2,cvikas-1);
		
		mvikas[2]=min_vikas(chessvikas,nvikas,rvikas-1,cvikas+2);
		
		mvikas[3]=min_vikas(chessvikas,nvikas,rvikas+1,cvikas+2);
		
		mvikas[4]=min_vikas(chessvikas,nvikas,rvikas+2,cvikas+1);
		
		mvikas[5]=min_vikas(chessvikas,nvikas,rvikas+2,cvikas-1);
		
		mvikas[6]=min_vikas(chessvikas,nvikas,rvikas-1,cvikas-2);
		
		mvikas[7]=min_vikas(chessvikas,nvikas,rvikas+1,cvikas-2);
		
		chessvikas[rvikas][cvikas]=1;
		
		int mivikas=Integer.MAX_VALUE;
		
		for(int x=0;x<8;x++){
		    
			if(mvikas[x]<mivikas)
				mivikas=mvikas[x];
			
		}
		return mivikas;		
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int nvikas=scan.nextInt();
		
		int[][] chessvikas = new int[nvikas][nvikas];
		
		for(int x=0;x<nvikas;x++){
		    
			for(int y=0;y<nvikas;y++)
				chessvikas[x][y] = scan.nextInt();
			
		}
		
		int avikas = min_vikas(chessvikas,nvikas,0,0);
		System.out.println(avikas);
	
    }
	
}
