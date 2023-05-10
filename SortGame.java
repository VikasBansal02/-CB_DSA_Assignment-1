    
        
            
            import java.util.*;
                
                    
                    


public class Main { 
        
            
                
                
	
    public static void main(String args[]) {    
            
            
        
		Scanner vikas_scan = new Scanner(System.in);               
		
		int vikas_x = vikas_scan.nextInt();     
		
		int vikas_n = vikas_scan.nextInt(); 
		
		ArrayList<vikas_employee_> vikas_list = new ArrayList<>();      
		
		for(int y=0; y < vikas_n; y++){ 
		        
		            
			String vikas_name = vikas_scan.next();  
			int vikas_salary_int = vikas_scan.nextInt();   
			    
			    
			    
			if(vikas_salary_int >= vikas_x)       
				vikas_list.add(new vikas_employee_(vikas_name,vikas_salary_int));
			            
			                
			                    
			                    
		}   
		    
		    
		        
		Collections.sort(vikas_list, new Comparator<vikas_employee_>() {         
		        
		            
		            
			public int compare(vikas_employee_ vikas_o_1, vikas_employee_ vikas_o_2){           
			        
			            
				if(vikas_o_1.vikas_salary_int == vikas_o_2.vikas_salary_int )               
					return vikas_o_1.vikas_name.compareTo(vikas_o_2.vikas_name);            
				        
				else            
					return vikas_o_2.vikas_salary_int - vikas_o_1.vikas_salary_int;     
				
				        
				            
				                
			}   
			    
			        
			            
			                
		}); 
		    
		    
		        
		for(vikas_employee_ vikas_e:vikas_list)      
			System.out.println(vikas_e.vikas_name + " " + vikas_e.vikas_salary_int);        
			    
			        
			        
			            
		
    }
        
            
            
    
    
    public static class vikas_employee_{        
                
                
                
		String vikas_name;          
		
		    
		int vikas_salary_int;   
		
		    
		    
		public vikas_employee_(String vikas_name,int vikas_salary_int){ 
		        
		            
		            
			this.vikas_name = vikas_name;       
			    
			    
			this.vikas_salary_int = vikas_salary_int;
			    
			     
			        
		}   
		    
		    
		        
	}   
	    
	    
	
	    
	    
	        
}       
    
    
