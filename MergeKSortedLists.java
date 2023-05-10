
        
        import java.util.*;
        
        
public class Main {
    
    
    
	static class TreeNode {
	    
		int vikas_val;
		
		TreeNode vikas_next;
		
		TreeNode() {
		    
		    
		}
		
		
		
	}
	
	
	
    public static void main( String args[] ) {
        
        
		Scanner vikas_sc = new Scanner(System.in);
		
		int vikas_k = vikas_sc.nextInt();
		
		int vikas_n = vikas_sc.nextInt();
		
		TreeNode[] vikas_arr = new TreeNode[vikas_k];
		
		for( int x=0; x < vikas_k; x++){
		    
		    
			TreeNode vikas_head = null;
			
			    TreeNode vikas_temp = null;
			            
			            
			            
			for(int y=0; y < vikas_n; y++){
			    
				TreeNode vikas_nn = new TreeNode();
				
				    int vikas_xx = vikas_sc.nextInt();
				                
				
				
				vikas_nn.vikas_val = vikas_xx;
				
				if( vikas_temp == null ){
				    
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
		
		
		PriorityQueue<TreeNode> vikas_pq = new PriorityQueue<>(new Comparator<TreeNode>() {
			
			public int compare(TreeNode vikas_o_1,TreeNode vikas_o_2){
			    
                    return vikas_o_1.vikas_val - vikas_o_2.vikas_val;
            
			    
			}
			
			
		});
		
		
		
		
		for(int x=0; x < vikas_arr.length; x++){
			
			if(vikas_arr[x] != null )
				    vikas_pq.add(vikas_arr[x]);
			
		}
		
		TreeNode vikas_Dummy = new TreeNode();
		
		TreeNode vikas_temp = vikas_Dummy;
		
		while(!vikas_pq.isEmpty() ) 
		{
		    
		    
			TreeNode vikas_r = vikas_pq.poll();
			
			vikas_Dummy.vikas_next = vikas_r;
			
			vikas_Dummy = vikas_Dummy.vikas_next;
			
			if( vikas_r.vikas_next != null )
				vikas_pq.add(vikas_r.vikas_next);
			
		    
		}
		
		
		vikas_temp = vikas_temp.vikas_next;
		
		while(vikas_temp != null){
		    
			System.out.print(vikas_temp.vikas_val + " ");
			
			vikas_temp = vikas_temp.vikas_next;
			
			
		}
		
		
		
    }
    
    
}
