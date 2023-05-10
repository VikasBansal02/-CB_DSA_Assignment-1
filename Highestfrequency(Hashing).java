    
        
            import java.util.*; 
                
                    
                    
                        

    
    
        public class Main {
    
        
            
                
                public static void main(String[] args) {        
                        
                        
        Scanner vikas_scan = new Scanner(System.in);            
            
            

   
        int vikas_n = vikas_scan.nextInt(); 
        
                
                
        int[] vikas_Arr = new int[vikas_n];         
            
                
                    



        for (int x=0; x < vikas_n; x++)             
            vikas_Arr[x] = vikas_scan.nextInt();
                
                    
                    
            

        int vikas_Freq_fvikas_Num_max = vikas_find_Max_Freq_Num(vikas_Arr);

        System.out.println( vikas_Freq_fvikas_Num_max);
    }
        
            
    public static int vikas_find_Max_Freq_Num(int[] vikas_Arr) {    
        
        Map<Integer, Integer> vikas_freq_Map = new HashMap<>(); 
            
            
        int vikas_Freq_fmax = 0;            
                
                    
                    
        int vikas_Num_max = 0;  
        
            
            

        for (int vikas_num : vikas_Arr) {   
                
                
            if (vikas_freq_Map.containsKey(vikas_num))          
                vikas_freq_Map.put(vikas_num, vikas_freq_Map.get(vikas_num) + 1);     
                    
            
            else        
                vikas_freq_Map.put(vikas_num, 1);       
            

            if (vikas_freq_Map.get(vikas_num) > vikas_Freq_fmax) {          
                
                    
                    
                vikas_Freq_fmax = vikas_freq_Map.get(vikas_num);        
                
                    
                        
                vikas_Num_max = vikas_num;      
                    
                    
                
            }       
            
                
                    
        }       
            
                
                

        return vikas_Num_max;       
            
            
                    
                    
                        
    }

        
            
                
}
