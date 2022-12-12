import java.util.*;

public class Main {
    
    public static void main(String args[]) {
		
		Q_cus q = new Q_cus();
		
		Scanner scan = new Scanner(System.in);
		
		int q_size = scan.nextInt();
		
		for(int x = 0; x < q_size; x++)
		    q.add(x);
		
		while(!q.isEmpty())
			System.out.print(q.dequeue() + " ");
		
    }
}

class Q_cus {
    
	Stack<Integer> b;
	
	Stack<Integer> f;
	
	Q_cus() {
	    
		b = new Stack<>();
		
		f = new Stack<>();
	    
	}
	
	public void add(int x) {
		
		b.push(x);
		
		add_Last(f,x);
	}
	
	public void add_Last(Stack<Integer> st, int v1) {
        
        if(st.size() == 0)
            st.add(v1);
        
        else {
            
            int v = st.pop();
            
            add_Last(st,v1);
            
            st.push(v);
            
        }
        
    }
    
    public void reverse_Stack(Stack<Integer> st) {
        
        if(st.size() == 0)
            return;
        
        int v1 = st.pop();
        
        reverse_Stack(st);
        
        add_Last(st,v1);
        
    }
    
	public int dequeue() {
	    
		if(!f.isEmpty())
		    return f.pop();
		
		return -1;
		
	}
	
	public boolean isEmpty() {
	    
		return f.isEmpty();
		
	}
	
}
