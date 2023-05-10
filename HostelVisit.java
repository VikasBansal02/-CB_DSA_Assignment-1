
    
        import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
    
    Scanner scvikas = new Scanner(System.in);
        
                
                int vikas_Q = scvikas.nextInt();
        
        int vikas_K = scvikas.nextInt();
        
        
                List<Long> vikas_near = new ArrayList<>();
                
                
        PriorityQueue<long[]> vikas_hostel = new PriorityQueue<>(new Comparator<long[]>() {
            
            @Override
            public int compare(long[] vikas_h_1, long[] vikas_h_2) {
                return Long.compare(vikas_h_2[0], vikas_h_1[0]); // compare by distance
            }
            
        });

        for (int  xx= 0; xx < vikas_Q; xx++) {
            
            int vikas_type = scvikas.nextInt();
            
            if( vikas_type == 1) {
                
                long x_vikas = scvikas.nextLong();
                
                long y_vikas = scvikas.nextLong();
                
                long[] hostel_vikas = new long[]{ x_vikas * x_vikas + y_vikas * y_vikas, x_vikas, y_vikas };
                
                vikas_hostel.offer(hostel_vikas);
                
                if ( vikas_hostel.size() > vikas_K )
                    vikas_hostel.poll();
                
                
                
            }
            
            else
                vikas_near.add(vikas_hostel.peek()[0]);
            
            
            
        }

        
        
        for ( long vikas_dist : vikas_near )
            System.out.println(vikas_dist);
        
        
        
    }
    
    
}
