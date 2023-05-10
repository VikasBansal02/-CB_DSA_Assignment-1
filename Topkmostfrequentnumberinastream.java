        
                
                import java.util.*;
                    
                        
                        
class Main {    
        
            
    public static void main(String[] args) {            
            
            
        Scanner vikas_scan = new Scanner(System.in);            
            
            
            
        int vikas_t = vikas_scan.nextInt();     
                
                    
        while(vikas_t > 0 ){        
            
		    HashMap<Integer,Integer> vikas_ht = new HashMap<>();    
		        
		            
            int vikas_n = vikas_scan.nextInt(); 
                
                    
            int vikas_k = vikas_scan.nextInt();     
                
            for(int x=0; x < vikas_n; x++){
                    
                int vikas_xx = vikas_scan.nextInt();  
                    
                
                if(!vikas_ht.containsKey(vikas_xx))
                    vikas_ht.put(vikas_xx,1);
                        
                else 
                    vikas_ht.replace(vikas_xx,vikas_ht.get(vikas_xx) + 1);
                    
                    
                        
                int [][]vikas_arr = new int[vikas_ht.size()][2];
            
                
                    int vikas_j=0;
                    
                for (Map.Entry<Integer,Integer> vikas_e: vikas_ht.entrySet()) {
                    
                    
                    vikas_arr[vikas_j][0] = vikas_e.getValue();
                        
                        vikas_arr[vikas_j][1] = vikas_e.getKey();
                        
                            
                            vikas_j++;
                } 
                
                
                Arrays.sort(vikas_arr, (vikas_a_1, vikas_b) -> (vikas_a_1[0] == vikas_b[0]) ? vikas_a_1[1] - vikas_b[1] : vikas_b[0] - vikas_a_1[0]);
                
                
                vikas_j = -1;    
                    
                        
                while(vikas_j++ < vikas_k - 1 && vikas_j < vikas_arr.length)        
                    System.out.print(vikas_arr[vikas_j][1] + " ");          
                        
                        
                            
                        
                            
            }
            
                
		    System.out.println();
		  
		    
		        
		            
		    vikas_t--;
		        
		            
		                
		                    
		  
        }   
            
                
                    
    }   
             
            
                
}
