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
	private Node tailvikas;
	private int sizevikas;


	public int sizevikas() {
	    
		return this.sizevikas;
		
	}

	public void addLastvikas(int datavikas) {
	    
		Node nodevikas = new Node(datavikas);

		if (this.sizevikas() == 0) {
			this.headvikas = nodevikas;
			this.tailvikas = nodevikas;
		} 
		else {
			this.tailvikas.next = nodevikas;
			this.tailvikas = nodevikas;
		}

		this.sizevikas++;
	}

	public static void main(String[] args) {

		Scanner scvikas = new Scanner(System.in);
		int Nvikas = scvikas.nextInt();
		int kvikas = scvikas.nextInt();

		Main listvikas = new Main();

		for (int x = 0; x < Nvikas; x++)
			listvikas.addLastvikas(scvikas.nextInt());
		
		listvikas.reversevikas(kvikas);
		listvikas.displayvikas();
	}
	
	public void displayvikas() {
	    
		Node nodevikas = this.headvikas;

		while (nodevikas != null) {
		    
			System.out.print(nodevikas.data + " ");
			nodevikas = nodevikas.next;
			
		}
		
	}

	public void reversevikas(int kvikas) {
	    
		Node currvikas = this.headvikas;
		Node dummyvikas = new Node();
		Node tempvikas = dummyvikas;
		
		Stack<Node> stvikas = new Stack<>();
		while (currvikas != null) {

			Node nodevikas = new Node();
			nodevikas.data = currvikas.data;
			stvikas.push(nodevikas);
			
			if (stvikas.size() == kvikas) {
			    
				while (!stvikas.isEmpty()) {
					dummyvikas.next = stvikas.pop();
					dummyvikas = dummyvikas.next;
				}
			}
			currvikas = currvikas.next;

		}
		
		while (!stvikas.isEmpty()) {
			dummyvikas.next = stvikas.pop();
			dummyvikas = dummyvikas.next;
		}
		
		this.headvikas = tempvikas.next;
		this.tailvikas = dummyvikas;

	}
	
}
