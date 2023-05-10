

    
        
        import java.util.*; 
            
                
                
public class Main { 
    
        
            
    
    public static void vikas_K_Frequent_Elements(int[] vikas_arr,int vikas_n,int vikas_k) {     
            
                    
                        
                        
		Map<Integer,Integer> vikas_map = new HashMap<>();
		
		for(int x=0; x < vikas_n; x++)
		
			vikas_map.put(vikas_arr[x], vikas_map.getOrDefault(vikas_arr[x],0) + 1);
			    
			    
			    

		 List<Map.Entry<Integer, Integer> > vikas_list = new ArrayList<Map.Entry<Integer, Integer> >(
                    
                    vikas_map.entrySet()
                
                
                );

		Collections.sort(
            vikas_list, new Comparator<Map.Entry<Integer, Integer> >() {
                
                
                public int compare(
                    
                    
                    Map.Entry<Integer, Integer> vikas_o_1,  
                    Map.Entry<Integer, Integer> vikas_o_2)      
                {
                        
                        
                    if (vikas_o_1.getValue() == vikas_o_2.getValue())           
                        return vikas_o_2.getKey() - vikas_o_1.getKey(); 
                        
                            
                    else        
                        return vikas_o_2.getValue() - vikas_o_1.getValue();     
                            
                                
                                    
                }
                
                    
                    
            }   
            
                
        
        
        );
            
                    
		PriorityQueue<Integer> vikas_pq = new PriorityQueue<>();

		for (int x = 0; x < vikas_k; x++)           
            vikas_pq.add(vikas_list.get(x).getKey());               
		
		
		
		while(!vikas_pq.isEmpty())          
			System.out.print(vikas_pq.poll() + " ");    
			    
			        
		

	} 
	
    
    public static void main (String args[]) {
            
            
		        Scanner vikas_scan = new Scanner(System.in);  
		        
		            
		int vikas_n = vikas_scan.nextInt(); 
		    
		int vikas_k = vikas_scan.nextInt();     
		
		    
		    
		int[] vikas_arr = new int[vikas_n];
		
		for(int x=0; x < vikas_n; x++)  
			vikas_arr[x] = vikas_scan.nextInt();
		
        vikas_K_Frequent_Elements(vikas_arr, vikas_n, vikas_k); 
            
                
    }
    
	    
	        
	        
}
