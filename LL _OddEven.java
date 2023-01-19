
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scvikas = new Scanner(System.in);
		
		int size = scvikas.nextInt();
		
		LinkedList<Integer> llvikas = new LinkedList<>();
		
		Queue<Integer> Oddvikas = new LinkedList<>();
		
		Queue<Integer> Evenvikas = new LinkedList<>();
		
		for(int x=0; x<size; x++)
			llvikas.add(scvikas.nextInt());
		
		
		for(int x=0; x<llvikas.size();x++) {
		    
			if(llvikas.get(x)%2!=0)
				Oddvikas.add(llvikas.get(x));
			
			else
				Evenvikas.add(llvikas.get(x));
			
		}
		
		
		Queue<Integer> ansvikas = new LinkedList<>();
		
		while(Oddvikas.size()>0)
			ansvikas.add(Oddvikas.poll());
		
		while(Evenvikas.size()>0)
			ansvikas.add(Evenvikas.poll());
		
		while(!ansvikas.isEmpty())
			System.out.print(ansvikas.poll()+" ");

	}

}
