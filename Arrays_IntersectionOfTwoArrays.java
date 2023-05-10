    
        
        import java.util.*; 
            
                
                    
public class Main { 
        
        
            
            
    public static void main(String args[]) {
                
		Scanner vikas_scan = new Scanner(System.in);
		
		int vikas_n = vikas_scan.nextInt();
		
		int[] vikas_arr_1 = new int[vikas_n];
		
		int[] vikas_arr_2 = new int[vikas_n];
		
		for(int x=0; x < vikas_arr_1.length; x++)       
			vikas_arr_1[x] = vikas_scan.nextInt();
		
		for(int x = 0; x < vikas_arr_2.length; x++)  
			vikas_arr_2[x] = vikas_scan.nextInt();
		
		Map<Integer,Integer> vikas_map = new TreeMap<>();       
		
		for(int x=0; x < vikas_arr_1.length; x++) {         
		                
			            
			            
			if(vikas_map.containsKey(vikas_arr_1[x]))
				vikas_map.put(vikas_arr_1[x], vikas_map.get(vikas_arr_1[x]) + 1);
			
			else
				vikas_map.put(vikas_arr_1[x],1);
			
			    
			    
		}
		    
		        
		ArrayList<Integer> vikas_answer = new ArrayList<>();
		
		    
		for(int x = 0; x < vikas_arr_2.length; x++) {       
		        
		        
		        
			if(vikas_map.containsKey(vikas_arr_2[x]) && vikas_map.get(vikas_arr_2[x]) > 0 ) {   
    			
    			    
    			        vikas_answer.add(vikas_arr_2[x]);
    			        
				vikas_map.put(vikas_arr_2[x], vikas_map.get(vikas_arr_2[x]) - 1);       
				    
				        
			}   
			    
			    
			        
			            
		}
		    
		    
		    
		Collections.sort(vikas_answer);     
		        
		System.out.print(vikas_answer);
		    
		        
		        
		            
		                
    }   
        
            
            
}
