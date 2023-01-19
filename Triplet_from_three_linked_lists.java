
import java.util.*;

class Main {
    
    public class Node {
        int data;
        Node next;
        
        Node(int data) {
            
            this.data = data;
            
        }
        
        Node(){
            
        }

    }

    Node headvikas;
    Node head1vikas;
    Node head2vikas;
    Node head3vikas;
    Node tailvikas;
    // int sizevikas;

    
    public void addlastvikas(int itemvikas) {
        
        Node nnvikas = new Node(itemvikas);
        
        if (headvikas==null) {
            
            headvikas = nnvikas;
            tailvikas = nnvikas;
            // sizevikas++;
            
        }
        
        else {
            
            tailvikas.next = nnvikas;
            tailvikas = nnvikas;
            // sizevikas++;

        }

    }
    
    public void displayvikas() {
        
        Node tempvikas = headvikas;
        
        while (tempvikas != null) {
            
            System.out.print(tempvikas.data + " ");
            tempvikas = tempvikas.next;
            
        }
        
    }

    
    public static void main (String args[]) {
        
        Scanner scvikas = new Scanner(System.in);
        
        Main llvikas = new Main();
        // Main llvikas1 = new Main();
        // Main llvikas2 = new Main();
        
        int n1vikas = scvikas.nextInt();
        int n2vikas = scvikas.nextInt();
        int n3vikas = scvikas.nextInt();
        
        while(n1vikas-->0){
            llvikas.addlastvikas(scvikas.nextInt());
        }
        
		llvikas.head1vikas=llvikas.headvikas;
		llvikas.headvikas=null;
		
		while(n2vikas-->0){
            llvikas.addlastvikas(scvikas.nextInt());
		}
		
        // System.out.println("--------------------");
        // llvikas.displayvikas();
        // System.out.println("--------------------");
        
		llvikas.head2vikas=llvikas.headvikas;
		llvikas.headvikas=null;
		
		while(n3vikas-->0){
            llvikas.addlastvikas(scvikas.nextInt());
		}
		
        // System.out.println("--------------------");
        // llvikas.displayvikas();
        // System.out.println("--------------------");
        
		llvikas.head3vikas=llvikas.headvikas;
		llvikas.headvikas=null;
		
        // int []arr1={12,6,29};
        // int []arr2={23,5,8};
        // int []arr3={90,20,59};
        // for(int x=0;x<arr1.length;x++){
        //     llvikas.addlastvikas(arr1[x]);
        // }
        // llvikas.head1vikas=llvikas.headvikas;
        // llvikas.headvikas=null;
        // for(int x=0;x<arr2.length;x++){
        //     llvikas.addlastvikas(arr2[x]);
        // }
        // llvikas.head2vikas=llvikas.headvikas;
        // llvikas.headvikas=null;
        // for(int x=0;x<arr3.length;x++){
        //     llvikas.addlastvikas(arr3[x]);
        // }
        // llvikas.head3vikas=llvikas.headvikas;
        // llvikas.headvikas=null;
        
		
		int kvikas = scvikas.nextInt();
        // int kvikas=101;
        
//      llvikas.headvikas=llvikas.head3vikas;
// 		llvikas.displayvikas();
        
		
		Node t1vikas = llvikas.head1vikas;
		Node t2vikas = llvikas.head2vikas;
		Node t3vikas = llvikas.head3vikas;
		
		while(t1vikas!=null){
		    
		    while(t2vikas!=null){
		        
		        while(t3vikas!=null){
		            
		            if(t1vikas.data + t2vikas.data + t3vikas.data == kvikas){
		                
		                System.out.print(t1vikas.data + " " + t2vikas.data + " " + t3vikas.data);
		                return;
		                
		            }
		            else 
		                t3vikas = t3vikas.next;
		            
		        }
		        
		        t2vikas = t2vikas.next;
		        t3vikas = llvikas.head3vikas;
		        
		    }
		    
		    t1vikas = t1vikas.next;
		    t2vikas = llvikas.head2vikas;
		    t3vikas = llvikas.head3vikas;
		    
		}
        
    }

}
