
        
        import java.util.*;


public class Main {


	public static void main(String[] args) {
	    
		Scanner vikas_sc = new Scanner(System.in);
		
		String vikas_str = vikas_sc.next();
		
		Mapped_Strings_vikas(vikas_str,"");


	}


	public static void Mapped_Strings_vikas(String vikas_ques, String vikas_ans) {
		
		
		if( vikas_ques.length() == 0 ){
		    
			System.out.println(vikas_ans);
			
			return;
			
		}
		
		
		char ch_vikas = vikas_ques.charAt(0);
		
		String vikas_ros = vikas_ques.substring(1);
		
		
		Mapped_Strings_vikas( vikas_ros, vikas_ans + (char)( ch_vikas + 'A' - '1' ) );
		
		
		
		if( vikas_ques.length() >= 2 ){
		    
		    
			String str_vikas = vikas_ques.substring(0,2);
			
			int n_vikas = Integer.parseInt(str_vikas);
			
			
			if( n_vikas <= 26 ) {
			    
			    vikas_ros = vikas_ques.substring(2);
			    
			    
			        Mapped_Strings_vikas( vikas_ros, vikas_ans + (char)( 'A' + n_vikas-1 ) );
			        
			        
			}           
			        
		            
		            	
		}
		
		    
		// vikas_
		    
	}



}
