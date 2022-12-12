
import java.util.*;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		Queue<Integer> q_1 = new LinkedList<>();
		
		Queue<Integer> q_2 = new LinkedList<>();
		
		Queue<Integer> q_3 = new LinkedList<>();
		
		Queue<Integer> q_4 = new LinkedList<>();
		
		Queue<Integer> answer = new LinkedList<>();
		
		boolean fr = false;
		
		boolean sr = false;
		
		boolean tr = false;
		
		boolean four_r = false;
		
		while(size-->0) {
		    
			char ch1 = scan.next().charAt(0);
			
			if(ch1 == 'E') {
			    
				int x1 = scan.nextInt();
				
				int y1 = scan.nextInt();
				
				if(x1 == 1) {
					
					q_1.offer(y1);
					
					if(!fr){ 
						
						answer.offer(1);
						
						fr = true;
						
					}
				}
				
				else if(x1 == 2) {
				    
					q_2.offer(y1);
					
					if(!sr){ 
					    
						answer.offer(2);
						
						sr = true;
						
					}
				}
				
				else if(x1 == 3) {
					
					q_3.offer(y1);
					
					if(!tr){
					    
						answer.offer(3);
						
						tr = true;
					    
					}
				}
				
				else if(x1 == 4) {
				    
					q_4.offer(y1);
					
					if(!four_r){ 
					    
						answer.offer(4);
						
						four_r = true;
						
					}
				}
				
			}
			
			else {
			    
				int f_1 = answer.peek();
				
				if(f_1 == 1) {
				    
					if(!q_1.isEmpty())
						System.out.println(1 + " " + q_1.poll());
					
					if(q_1.isEmpty()) {
					    
						answer.poll();
						
						fr = false;
						
					}
				}
				
				if(f_1 == 2) {
				    
					if(!q_2.isEmpty())
						System.out.println(2 + " " + q_2.poll());
					
					if(q_2.isEmpty()) {
					    
						answer.poll();
						
						sr = false;
						
					}
					
				}
				
				if(f_1 == 3) {
				    
					if(!q_3.isEmpty())
						System.out.println(3 + " " + q_3.poll());
					
					if(q_3.isEmpty()) {
					    
						answer.poll();
						
						tr = false;
						
					}
					
				}
				if(f_1 == 4) {
				    
					if(!q_4.isEmpty())
						System.out.println(4 + " " + q_4.poll());
					
					if(q_4.isEmpty()) {
					    
						answer.poll();
						
						four_r = false;
						
					}

				}

			}

		}

	}

}
