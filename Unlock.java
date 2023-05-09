
    import java.util.*;
        
        
public class Main {
    
    public static void main(String args[]) {
        
		Scanner vikas_scan = new Scanner(System.in);
		
		int vikas_n = vikas_scan.nextInt();
		
		int vikas_k = vikas_scan.nextInt();
		
		int[] vikas_arr = new int[vikas_n];
		
		for(int x = 0; x < vikas_n; x++)
			vikas_arr[x] = vikas_scan.nextInt();
		
		HashMap<Integer,Integer> vikas_map = new HashMap<>();   
		
		for(int x=0; x < vikas_arr.length; x++) 
			vikas_map.put(vikas_arr[x], x);
		
		for(int x=0; x < vikas_n && vikas_k > 0; x++){  
		    
			if(vikas_arr[x] != vikas_n - x){    
			        
			            
				int vikas_t = vikas_arr[x];
				
				vikas_arr[x] = vikas_n - x;
				
				vikas_arr[vikas_map.get(vikas_n - x)] = vikas_t;
				
				vikas_map.put(vikas_t, vikas_map.get(vikas_n - x));
				
				vikas_k--;
				    
				        
			}   
			        
			        
		}       
		    
		        
		for(int x=0; x < vikas_n; x++)
			System.out.print(vikas_arr[x] + " ");
		
    }   
        
            
                
}
