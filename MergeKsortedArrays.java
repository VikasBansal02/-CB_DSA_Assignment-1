
    import java.util.*;


public class Main {
	
    public static void main(String args[]) {
        
		Scanner vikas_scan = new Scanner(System.in);
		
		int vikas_k = vikas_scan.nextInt();
		
		int vikas_n = vikas_scan.nextInt();
		
		Vikas_List_Node[] vikas_arr = new Vikas_List_Node[vikas_k];
		
		for(int x=0; x < vikas_k; x++) {    
		    
			Vikas_List_Node vikas_head = null;
			
			Vikas_List_Node vikas_temp = null;
			
			for(int y = 0; y < vikas_n; y++) {  
			    
				Vikas_List_Node vikas_nn = new Vikas_List_Node();
				
				int vikas_x = vikas_scan.nextInt();
				
				vikas_nn.vikas_val = vikas_x;
				
				if(vikas_temp == null) { 
				    
					vikas_head = vikas_nn;
					
					vikas_temp = vikas_head;
					
				}
				
				else {  
				    
					vikas_temp.vikas_next = vikas_nn;
					
					vikas_temp = vikas_temp.vikas_next;
					
				}   
				    
				        
			}
			
			vikas_arr[x] = vikas_head;
			    
			        
		}
		    
		        
		        
		PriorityQueue<Vikas_List_Node> vikas_pq = new PriorityQueue<>(new Comparator<Vikas_List_Node>(){    
		        
			public int compare(Vikas_List_Node vikas_o_1, Vikas_List_Node vikas_o_2)    {   
                        
                    return vikas_o_1.vikas_val - vikas_o_2.vikas_val;
            
			        
			}
			    
			    
			        
		});
		    
		    
		for(int x = 0; x < vikas_arr.length; x++){
			    
			        
			vikas_pq.add(vikas_arr[x]);
			    
			    
		}
		
		
		Vikas_List_Node Vikas_dummy = new Vikas_List_Node();
		
		Vikas_List_Node vikas_temp = Vikas_dummy;
		
		while(!vikas_pq.isEmpty())  {   
		    
			Vikas_List_Node vikas_r = vikas_pq.poll();
			
			Vikas_dummy.vikas_next = vikas_r;
			
			Vikas_dummy = Vikas_dummy.vikas_next;
			
			if(vikas_r.vikas_next != null)
				vikas_pq.add(vikas_r.vikas_next);
			
		        
		        
		}   
		
		vikas_temp = vikas_temp.vikas_next;
		
		    
		while(vikas_temp != null)   {   
		    
			System.out.print(vikas_temp.vikas_val + " ");
			
			vikas_temp = vikas_temp.vikas_next; 
			    
			        
		}   
		    
		
    }
    
    
    public static class Vikas_List_Node{
        
		int vikas_val;
		
		    Vikas_List_Node vikas_next;
		    
		Vikas_List_Node(){  
		    
		    
		}
		
		    
	}   
	
}
