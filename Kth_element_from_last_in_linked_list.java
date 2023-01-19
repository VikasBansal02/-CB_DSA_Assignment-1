import java.util.*;
public class Main {
	private Node headvikas;
    private int sizevikas;
    private Node tailvikas;
    
    public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
        }
        
        public Node(){
            
        }
    }

	//Add element in the Front in Linkedlist
    public void addFirst(int itemvikas){
        Node temp = new Node(itemvikas);
        if(this.sizevikas == 0){
            this.headvikas=temp;
            this.tailvikas=temp;
            this.sizevikas++;
        }
        else{
            temp.next=this.headvikas;
            this.headvikas=temp;
            this.sizevikas++;
        }
        
    }

	public void addLast(int itemvikas){
        
        if(this.sizevikas==0){
            addFirst(itemvikas);
        }
        else{
            Node temp = new Node(itemvikas);
            this.tailvikas.next=temp;
            this.tailvikas=temp;
            this.sizevikas++;
        }
        
    }
	
	public int kthlastelement(int kvikas){
		if(kvikas==1)
            return tailvikas.data;
        if(kvikas==this.sizevikas)
            return headvikas.data;
    
		Node slowvikas=headvikas;
		Node fastvikas=headvikas;
		int i=0;
		while(i++<kvikas-1)
				fastvikas=fastvikas.next;
		while(fastvikas!=null && fastvikas.next!=null){
			fastvikas=fastvikas.next;
			slowvikas=slowvikas.next;
		}
		return slowvikas.data;
	}

    public static void main (String args[]) {

		Main nvikas = new Main();
		Scanner scvikas = new Scanner(System.in);
		while(true){
			int numvikas = scvikas.nextInt();
			if(numvikas==-1)
				break;
			nvikas.addLast(numvikas);
		}
		int indexvikas=scvikas.nextInt();
		System.out.println(nvikas.kthlastelement(indexvikas));

    }
}
