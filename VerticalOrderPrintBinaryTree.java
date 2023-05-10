    
        
            import java.util.*;

class Main{
    
    static Scanner vikas_scan = new Scanner(System.in);     
        
        
    static Vikas_TreeNode vikas_root = null;        
    
    public static Vikas_TreeNode vikas_take_Input() {       
        
        Queue<Vikas_TreeNode> vikas_q = new LinkedList<>(); 
            
        Vikas_TreeNode vikas_nn = new Vikas_TreeNode(vikas_scan.nextInt()); 
            
        vikas_root = vikas_nn;  
            
        vikas_q.add(vikas_root);    
            
            
        while (!vikas_q.isEmpty())  {   
            
            Vikas_TreeNode vikas_rv = vikas_q.remove();     
            
            if(vikas_scan.hasNext()){   
                
				int vikas_l = vikas_scan.nextInt();     
				
				if(vikas_l != -1)   {           
				        
				        
					Vikas_TreeNode vikas_node =  new Vikas_TreeNode(vikas_l);       
					
                    vikas_rv.vikas_left = vikas_node;
                    
                        vikas_q.add(vikas_node);        
                        
                        
                }   
                    
                        
                        
            }
			if(vikas_scan.hasNext()){   
			        
				int vikas_r = vikas_scan.nextInt(); 
				    
				if(vikas_r != -1){      
				    
					Vikas_TreeNode vikas_node =  new Vikas_TreeNode(vikas_r);   
					    
                    vikas_rv.vikas_right = vikas_node;      
                        
                            
                    vikas_q.add(vikas_node);        
                        
                            
                            
                }       
                    
                    
			}   
			
			    
        }   
            
            
        return vikas_root;      
            
            
    }   
        
        
            
    
    HashMap<Integer,ArrayList<Integer>> vikas_a = new HashMap<>();  
        
    int vikas_c = 0, vikas_min = 0; 
        

    public static ArrayList <Integer> vikas_vertical_Order(Vikas_TreeNode vikas_root) {     
        
        Main vikas_obj = new Main();    
            
            
        HashMap<Integer,ArrayList<Integer>> vikas_v = vikas_obj.vikas_vertical(vikas_root, vikas_obj.vikas_c, vikas_obj.vikas_a );      
            
            
        ArrayList<Integer> vikas_ar = new ArrayList<>();    
            
            
        
        for(int x = vikas_obj.vikas_min; x <= vikas_v.size(); x++){     
                
            if(vikas_v.containsKey(x)){     
                    
                ArrayList<Integer> vikas_array = vikas_v.get(x);
                
                for(int y=0; y < vikas_array.size(); y++){  
                    
                    vikas_ar.add(vikas_array.get(y));   
                        
                            
                }   
                    
                    
            }   
                
                
            else        
                break;  
                    
                    
        }       
            
            
        return vikas_ar;    
            
            

    }
    
    public static void main(String[] args) {        
        
        int vikas_l = vikas_scan.nextInt();     
        
        vikas_take_Input(); 
            
		ArrayList<Integer> vikas_a = vikas_vertical_Order(vikas_root);      
		
		for(int x = 0; x < vikas_a.size(); x++)     
		    System.out.print(vikas_a.get(x) + " ");     
		    
		        
		        
    }   
            
            
            

    

    HashMap<Integer,ArrayList<Integer>> vikas_vertical(Vikas_TreeNode vikas_root, int vikas_c, HashMap<Integer,ArrayList<Integer>> vikas_a )    {       
            
            
        if(vikas_root == null)
            return vikas_a;
        
        else{       
                
            if(!vikas_a.containsKey(vikas_c))   {         
                    
                    
                ArrayList<Integer> vikas_ar = new ArrayList<>();          
                
                vikas_ar.add(vikas_root.vikas_data);          
                    
                    
                vikas_a.put(vikas_c,vikas_ar);          
                    
                    
                    
            }   
                
            else{  
                
                        
                    ArrayList<Integer> vikas_ar = vikas_a.get(vikas_c); 
                            
                            
                vikas_ar.add(vikas_root.vikas_data);        
                
                vikas_a.replace(vikas_c,vikas_ar);  
                    
                    
            }   
                
                
            vikas_min = Math.min(vikas_c,vikas_min);    
                
                
        }   
            
            
        vikas_vertical(vikas_root.vikas_left,vikas_c - 1, vikas_a); 
            
            
        vikas_vertical(vikas_root.vikas_right, vikas_c + 1, vikas_a);   
        
            
        return vikas_a;     
        
            
    }   
        
        

    
}

        
        
    class Vikas_TreeNode {
        
            int vikas_data; 
            
        Vikas_TreeNode vikas_right;     
        
        Vikas_TreeNode vikas_left;      
    
        
        Vikas_TreeNode(int val){
            
            vikas_data=val;     
                
                
        }   
            
            
                
                    
}
