
import java.util.*;

class Main {
    
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
    public void addFirstvikas(int itemvikas){
        
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

	public void addLastvikas(int itemvikas){
        
        if(this.sizevikas==0){
            
            addFirstvikas(itemvikas);
            
        }
        
        else{
            
            Node tempvikas = new Node(itemvikas);
            this.tailvikas.next=tempvikas;
            this.tailvikas=tempvikas;
            this.sizevikas++;
            
        }
        
    }
    
    public int removefirstvikas() {
        
		Node tempvikas = headvikas;
		
		if (sizevikas == 1) {
		    
			headvikas = null;
			tailvikas = null;
			sizevikas--;
			
		} 
		
		else {
		    
			headvikas = headvikas.next;
			tempvikas.next = null;
			sizevikas--;
			
		}
		
		return tempvikas.data;

	}

    
	public int removelastvikas() throws Exception {
	    
		if (sizevikas == 1) {
		    
			return removefirstvikas();
			
		} 
		
		else {
		    
			Node ssvikas = GetNodevikas(sizevikas - 2);
			int rvikas = tailvikas.data;
			tailvikas = ssvikas;
			tailvikas.next = null;
			sizevikas--;
			return rvikas;
			
		}

	}
    
    public void displayvikas() {
        
        Node tempvikas = headvikas;
        
        while (tempvikas != null) {
            
            System.out.print(tempvikas.data + " ");
            tempvikas = tempvikas.next;
            
        }
        
    }


    public Node GetNodevikas(int kvikas) throws Exception {
        
        if (kvikas < 0 || kvikas >= sizevikas)
            throw new Exception("Index Out of Range........");
        
        Node tempvikas = headvikas;
        
        for (int x = 1; x <= kvikas; x++)
            tempvikas = tempvikas.next;
        
        return tempvikas;
    }
    
    public int getlastvikas() {
        
		return tailvikas.data;
		
	}
    
    public static void main (String args[])  throws Exception {
        
        Scanner scvikas = new Scanner(System.in);
        Main llvikas = new Main();
        
        int nvikas = scvikas.nextInt();
        
        while(nvikas-- > 0)
            llvikas.addLastvikas(scvikas.nextInt());
        
        int kvikas = scvikas.nextInt();
		
		while(kvikas-- > 0){
		    
			llvikas.addFirstvikas(llvikas.getlastvikas());
			llvikas.removelastvikas();
			
		}
		
		llvikas.displayvikas();
		
    }
    
    

}
