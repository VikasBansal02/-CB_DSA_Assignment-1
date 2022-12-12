import java.util.*;
import java.util.Scanner;

public class Main 
{
	
	public static HashSet<Integer> s1vikas;
	public static HashSet<Integer> s2vikas;
	public static int ctvikas;
	
	public static void Chess_vikas(int nvikas,int wvikas,int pvikas,String svikas){
	    
		if(wvikas<0||pvikas<0||wvikas>=nvikas||pvikas>=nvikas)
			return;
		if(wvikas==nvikas-1 && pvikas==nvikas-1){
			ctvikas++;
			System.out.print(svikas+'{'+wvikas+'-'+pvikas+"} ");
			return;
		}
		
		if(s1vikas.contains(nvikas*wvikas+pvikas+1))
			return;
		if(s2vikas.contains(nvikas*wvikas+pvikas+1)){
			Chess_vikas(nvikas,nvikas-1,nvikas-1,  svikas+'{'+wvikas+'-' + pvikas+ "}P");
		}
		
		Chess_vikas(nvikas,wvikas+2,pvikas+1, svikas+'{'+wvikas+'-' + pvikas+ "}K" );
		Chess_vikas(nvikas,wvikas+1,pvikas+2, svikas+'{'+wvikas+'-' + pvikas+ "}K" );
		if(wvikas==0||pvikas==0||wvikas==nvikas-1||pvikas==nvikas-1){
			
			for(int mvikas=1;mvikas<nvikas;mvikas++)
				Chess_vikas(nvikas,wvikas,pvikas+mvikas, svikas+'{'+wvikas+'-' + pvikas+ "}R" );
			
			for(int mvikas=1;mvikas<nvikas;mvikas++)
				Chess_vikas(nvikas,wvikas+mvikas,pvikas, svikas+'{'+wvikas+'-' + pvikas+ "}R" );
		}
		if(wvikas==pvikas||wvikas+pvikas==nvikas-1)
			for(int mvikas=0;mvikas<nvikas;mvikas++)
				Chess_vikas(nvikas,wvikas+mvikas+1,pvikas+1+mvikas,svikas+ '{'+wvikas+'-' + pvikas+ "}B" );
	}
	
	public static void Board_vikas(int nvikas){
	    
		boolean vikas[]=new boolean[nvikas*nvikas+1];
		
		for(int wvikas=2;wvikas<vikas.length;wvikas++)
			if(!vikas[wvikas])
			for(int pvikas=wvikas*wvikas;pvikas<vikas.length;pvikas+=wvikas)
				vikas[pvikas]=true;
		boolean tvikas=true;
		for(int wvikas=2;wvikas<vikas.length;wvikas++){
		    if(!vikas[wvikas] && tvikas)
			    s1vikas.add(wvikas);
		    else if(!vikas[wvikas])
			        s2vikas.add(wvikas);	
		    if(!vikas[wvikas])
		        tvikas=!tvikas;
		}
	}
	
	public static void main(String args[]) 
	{
		ctvikas=0;
        Scanner scan=new Scanner(System.in);
		int nvikas=scan.nextInt();
		s1vikas=new HashSet<>();
		s2vikas=new HashSet<>();
		Board_vikas(nvikas);
		Chess_vikas(nvikas,0,0,"");
		System.out.println("\n"+ctvikas);
    }
	
}
