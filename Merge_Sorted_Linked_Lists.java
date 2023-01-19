import java.util.*;

public class Main {
    
	public class Node {
	    
		int data;
		Node next;

		Node(int data) {
		    
			this.data = data;

		}

		public Node() {
		    
		}
	}

	private Node headvikas;
	private Node head1vikas;
	private Node head2vikas;
	private Node tailvikas;
// 	private int sizevikas;


// 	public int sizevikas() {
	    
// 		return this.sizevikas;
		
// 	}

	public void addLastvikas(int datavikas) {
	    
		Node nodevikas = new Node(datavikas);

		if (headvikas == null) {
		    
			this.headvikas = nodevikas;
			this.tailvikas = nodevikas;
			
		}
		
		else {
		    
			this.tailvikas.next = nodevikas;
			this.tailvikas = nodevikas;
			
		}


	}

	
	public void displayvikas() {
	    
		Node nodevikas = this.headvikas;

		while (nodevikas != null) {
		    
			System.out.print(nodevikas.data + " ");
			nodevikas = nodevikas.next;
			
		}
		System.out.println();
		
	}

	public static void main(String[] args) {

		Scanner scvikas = new Scanner(System.in);
		int testvikas = scvikas.nextInt();
		
		while(testvikas-->0){
		    
		    Main llvikas = new Main();
		    
		    int N1vikas = scvikas.nextInt();
		    for (int x = 0; x < N1vikas; x++)
			    llvikas.addLastvikas(scvikas.nextInt());
			
			llvikas.head1vikas = llvikas.headvikas;
			llvikas.headvikas=null;
			
		    int N2vikas = scvikas.nextInt();
		    for (int x = 0; x < N2vikas; x++)
			    llvikas.addLastvikas(scvikas.nextInt());
			
			llvikas.head2vikas = llvikas.headvikas;
			llvikas.headvikas=null;
			
			llvikas.headvikas= llvikas.mergeTwoListsvikas(llvikas.head1vikas,llvikas.head2vikas);
			llvikas.displayvikas();
			
		}

	}
	
	public Node mergeTwoListsvikas(Node list1vikas, Node list2vikas) {
	    
            Node Dummyvikas = new Node();
            Node tempvikas = Dummyvikas;
            
            while(list1vikas!=null && list2vikas!=null){
                
                if(list1vikas.data<list2vikas.data){
                    
                    tempvikas.next=list1vikas;
                    tempvikas=tempvikas.next;
                    list1vikas=list1vikas.next;
                    
                }
                else{
                    
                    tempvikas.next=list2vikas;
                    tempvikas=tempvikas.next;
                    list2vikas=list2vikas.next;
                    
                }
                
            }
            
            if(list1vikas==null)
                tempvikas.next=list2vikas;
            
            if(list2vikas==null)
                tempvikas.next=list1vikas;
            
            headvikas=null;
            head1vikas=null;
            head2vikas=null;
            return Dummyvikas.next;

	}
	
}
