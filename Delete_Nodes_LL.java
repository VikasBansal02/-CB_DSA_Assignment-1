
import java.util.*;

class Main {
    
    public void removevikas(){
	    
        Node tvikas = headvikas.next.next;
        Node hvikas = headvikas;
        Node h1vikas = headvikas;
        
        while(hvikas != null && hvikas.next != null){
            
            if(tvikas != null && hvikas != null && hvikas.next !=null && hvikas.next.data < tvikas.data){
                
                Node previkas = hvikas;
                Node currvikas = previkas.next;
                previkas.next = currvikas.next;
                currvikas.next = null;
                hvikas = h1vikas;
                
            }
            
            else if(tvikas!=null)
                tvikas =tvikas.next;
            
            if(tvikas==null && hvikas!=null){
                
                hvikas=hvikas.next;
                tvikas=hvikas.next;
                
            }
            
        }
        
        tvikas=headvikas.next;
        
        while(tvikas != null){
            
            if(tvikas.data > headvikas.data){
                
                headvikas = headvikas.next;
                break;
                
            }
            
            else
                tvikas = tvikas.next;
            
        }

	     
	 }
    
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
    
    public void displayvikas() {
        Node temp = headvikas;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }


    public static void main (String args[]) {
        
        Scanner scvikas = new Scanner(System.in);
        Main llvikas = new Main();
        
        int nvikas = scvikas.nextInt();
        
		while(nvikas-- > 0)
			llvikas.addLastvikas(scvikas.nextInt());
		
		llvikas.removevikas();
        llvikas.displayvikas();
        
    }
    
	

}
