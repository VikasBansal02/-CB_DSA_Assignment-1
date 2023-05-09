    
        
        import java.util.*;
 
class Main
{
 
    
    public static int vikas_sum_of_length(int[] vikas_arr, int vikas_n)    {        
        
        Set<Integer> vikas_s = new HashSet<>();     
 
        
        int vikas_y = 0, vikas_answer = 0;
 
        
        for (int vikas_x = 0; vikas_x < vikas_n; vikas_x++){          
                
                
            while (vikas_y < vikas_n && !vikas_s.contains(vikas_arr[vikas_y]))
                {
                    
                    
                vikas_s.add(vikas_arr[vikas_y]);
                
                
                vikas_y++;
            }
 
            
            vikas_answer += ((vikas_y - vikas_x) * (vikas_y - vikas_x + 1)) / 2;
 
            
            vikas_s.remove(vikas_arr[vikas_x]);
        }
                
                
 
        return vikas_answer;
    }
 
    
    public static void main(String[] args)
    {   
            
            
        Scanner vikas_scan  = new Scanner(System.in);
            
            
            
        int vikas_size = vikas_scan.nextInt();
            
                
        int []vikas_arr = new int[vikas_size];
        
        for(int vikas = 0; vikas < vikas_size; vikas++)
            vikas_arr[vikas] = vikas_scan.nextInt();
        
        // int[] arr = { 1, 2, 3};
        // int n = arr.length;
 
        System.out.println(vikas_sum_of_length(vikas_arr, vikas_size));
        // Svikas_ystem.out.println(vikas_size);
            
                
                
    }
        
            
            
}
    
