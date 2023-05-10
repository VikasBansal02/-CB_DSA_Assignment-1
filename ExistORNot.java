    
        
        import java.util.*;
            
    
public class Main {
            
                
                    
                        
                        
    public static void main(String args[]) {    
        
		Scanner vikas_scan = new Scanner(System.in);
		
		int vikas_t = vikas_scan.nextInt();
		
		while(vikas_t > 0) {   
		        
		            
			HashMap<Integer,Integer> vikas_map = new HashMap<>();
			
			int vikas_n = vikas_scan.nextInt();
			
			for(int x=0; x<vikas_n; x++) {  
			        
				int vikas_x = vikas_scan.nextInt();
				
				vikas_map.put(vikas_x,1);
				    
				        
			}
			    
			        
			int vikas_q = vikas_scan.nextInt();
			
			while(vikas_q>0){
			    
				int vikas_key = vikas_scan.nextInt();
				
				if(vikas_map.containsKey(vikas_key))
					System.out.println("Yes");
				
				else
					System.out.println("No");
				
				
				    vikas_q--;
				    
				     
			}
			    
			        vikas_t--;
			        
			      
		}   
		    
		                
		                
    }       
        
            
                
                    
                    
}
