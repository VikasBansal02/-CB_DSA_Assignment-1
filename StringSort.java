        
            
                
                import java.util.*; 
                    
                    
                        
                            
                                
                                
    
        
        
            
                public class Main { 
                    
                        
                            
    public static void main(String args[]) {        
            
            
                
		Scanner vikas_scan = new Scanner(System.in);    
		    
		        
		int vikas_n = vikas_scan.nextInt();     
		
		
		ArrayList<String> vikas_str = new ArrayList<>();        
		
		    
		for(int vikas = 0; vikas < vikas_n; vikas++){   
		        
		            
			String vikas_s = vikas_scan.next(); 
			    
			        
			        
			vikas_str.add(vikas_s); 
			
			    
			        
			     
		}
		    
		    
		Collections.sort(vikas_str, new Comparator<String>() {
			
			
			
			public int compare(String vikas_s_1, String vikas_s_2) {    
			    
				if(vikas_s_1.contains(vikas_s_2))   
					return vikas_s_2.compareTo(vikas_s_1);    
					    
				
				return vikas_s_1.compareTo(vikas_s_2);      
				
				        
				        
				            
			}   
			    
			        
			        
		}); 
		    
		    
		    
		for(String vikas:vikas_str){        
		    
			System.out.println(vikas);      
			    
			    
			        
			            
		}   
		    
		        
		            
		            
		                
	}       
	    
	        
	        
    
                        
                        
                }
