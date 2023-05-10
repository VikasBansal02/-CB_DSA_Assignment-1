    
        
            import java.util.*;     
                
                    
class Main {    
        
        
    public static void main(String[] args) {    
            
                
        Scanner vikas_scan = new Scanner(System.in);    
                
                
        int vikas_test = vikas_scan.nextInt();  
            
            
            
        while(vikas_test > 0)   {           
                    
                    
            int vikas_n = vikas_scan.nextInt(); 
                
                    
            PriorityQueue<Integer> vikas_left = new PriorityQueue<>(Collections.reverseOrder());    
                
                    
            PriorityQueue<Integer> vikas_right = new PriorityQueue<>(); 
                
                    
                    
            for (int x = 0; x < vikas_n; x++) {   
                        
                            
                            
                int vikas_xx = vikas_scan.nextInt();
                    
                        
                if(vikas_left.isEmpty() || vikas_right.size() == vikas_left.size()){
                    
                        
                            
                            vikas_left.add(vikas_xx);
                   
                }   
                    
                else if(vikas_right.size() < vikas_left.size()){  
                        
                        
                            
                            vikas_right.add(vikas_xx); 
                        
                            
                }   
                    
                    
                if(!vikas_right.isEmpty() && vikas_left.peek() > vikas_right.peek()){   
                        
                            int vikas_v = vikas_right.poll();   
                                
                        vikas_right.add(vikas_left.poll());         
                        
                            
                                vikas_left.add(vikas_v);        
                    
                        
                        
                }   
                    
                    
                if(vikas_right.size() < vikas_left.size())                  
                    System.out.print(vikas_left.peek() + " ");      
                                
                                    
                                        
                else                
                    System.out.print((vikas_left.peek() + vikas_right.peek()) / 2 + " ");   
                            
                            
            }   
            
                
            
                
            System.out.println();   
                
                    
            vikas_test--;
                    
                    
                        
        }   
            
                
                    
                    
    }   
        
        
            
                
}
