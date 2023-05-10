

    
        import java.util.*;


import java.io.*;

class BinaryTree
{
    
    private class TreeNode
    {
        
        int vikas_val;
        
        TreeNode vikas_left;
        
        TreeNode vikas_right;
        
        TreeNode(int vikas_val)
        {
            
            this.vikas_val=vikas_val;
            
        }
        
    }

    TreeNode vikas_root;

    BinaryTree(String[] vikas_arr)
    {
        
        Queue<TreeNode> vikas_queue = new LinkedList<TreeNode>();
        
        construct( vikas_arr, 0, vikas_queue );
        
        
    }
    
	class vikas_Pair{
	    
		int vikas_data;
		
		TreeNode vikas_val;
		
		vikas_Pair(int vikas_data, TreeNode vikas_val){
			
			this.vikas_data = vikas_data;
			
			this.vikas_val = vikas_val;
			
		}
		
		
	}
	
    public void vikas_top_view() {
        
        vikas_vertical_Traversal_Top_view(this.vikas_root);
        
    }

   private void vikas_vertical_Traversal_Top_view(TreeNode vikas_root) {
       
	   Queue<vikas_Pair> vikas_q = new LinkedList<>();
	   
	   Map<Integer,Integer> vikas_map = new TreeMap<>();
	   
	   vikas_q.add(new vikas_Pair( 0, vikas_root ));
	   
	   
	   while(!vikas_q.isEmpty()){
	       
		   vikas_Pair vikas_r = vikas_q.poll();
		   
		   if(!vikas_map.containsKey(vikas_r.vikas_data))   
			   vikas_map.put(vikas_r.vikas_data, vikas_r.vikas_val.vikas_val);
		   
		   if(vikas_r.vikas_val.vikas_left != null )    
			   vikas_q.add(new vikas_Pair( vikas_r.vikas_data - 1, vikas_r.vikas_val.vikas_left ));
		   
		   if( vikas_r.vikas_val.vikas_right != null)   
			   vikas_q.add(new vikas_Pair( vikas_r.vikas_data + 1, vikas_r.vikas_val.vikas_right ));
		   
	   }
	    
	        
	   for(Integer x:vikas_map.keySet()){
	       
		   if(vikas_map.get(x) != -1)   
		   	System.out.print( vikas_map.get(x) + " " );
		   	    
		   	    
	   }    
	   
	   
   }



    private void construct(String[] vikas_arr, int vikas_ind, Queue<TreeNode> vikas_queue ) {
        
        
        if(vikas_ind >= vikas_arr.length)
            return;
        
        
        if(vikas_queue.size()==0)    {
            
            TreeNode vikas_nn = new TreeNode(Integer.parseInt(vikas_arr[vikas_ind]));
            
            this.vikas_root = vikas_nn;
            
            vikas_queue.add(vikas_nn);
                
                    
        }
            
            
        else
        {
            
            TreeNode vikas_parent = vikas_queue.peek();
            
            if(vikas_parent.vikas_val != -1){
                
                if(vikas_parent.vikas_left == null)
                {
                    vikas_parent.vikas_left = new TreeNode(Integer.parseInt(vikas_arr[vikas_ind]));
                    
                    vikas_queue.add(vikas_parent.vikas_left);
                        
                            
                }
                    
                
                else
                {
                    
                    if(vikas_parent.vikas_right == null)
                    {
                        
                        vikas_parent.vikas_right = new TreeNode(Integer.parseInt(vikas_arr[vikas_ind]));
                            
                            vikas_queue.add(vikas_parent.vikas_right);
                        
                        
                        vikas_queue.poll();
                            
                                
                    }
                        
                            
               }
                
                    
                    
               
            }
            else               {
                   
                   vikas_queue.poll();
                   
                   
                   vikas_ind--;
                    
                        
               }
                
                
        }
        
            
                
        construct(vikas_arr, vikas_ind+1, vikas_queue);
            
                
    }

    
        
    public void display()
    {
            
        display_tree(this.vikas_root);
            
    }


    private void display_tree(TreeNode vikas_root)
    {
            
            
        if(vikas_root==null)
            return;
            
        String vikas_str = vikas_root.vikas_val + "";
        
            
        if(vikas_root.vikas_left != null)
            vikas_str = vikas_root.vikas_left.vikas_val + " <= " + vikas_str;
        
        else
            vikas_str = "END <= " + vikas_str;


        if(vikas_root.vikas_right != null)
            vikas_str = vikas_str + " => " + vikas_root.vikas_right.vikas_val;
        
        else
            vikas_str = vikas_str + " => END";
    
        
            
        System.out.println(vikas_str);
            
                    
        display_tree(vikas_root.vikas_left);
            
                
        display_tree(vikas_root.vikas_right);

    }


}

public class Main {
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader vikas_br =new BufferedReader(new InputStreamReader(System.in));
        
        String[] vikas_arr = vikas_br.readLine().split(" ");
        
        BinaryTree vikas_bt = new BinaryTree(vikas_arr);
        
        vikas_bt.vikas_top_view();

    }
    
    
}
