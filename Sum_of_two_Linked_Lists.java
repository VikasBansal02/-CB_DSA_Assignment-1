
import java.util.*;

public class Main {
    
      
    public class Node{
        
        Node next;
        int val;
        
        Node(int val){
            
            this.val=val;
            this.next=null;
            
        }
        
        Node(){
            
        }
        
    }
    
    Node headvikas;
    Node headvikas1;
    
    
    
    
	public void addVikas()
    {
        
        StringBuilder sb = new StringBuilder();
        
        Node tempvikas=headvikas;
        Node tempvikas1=headvikas1;
        
        Node dummyvikas=new Node(0);
        
        Node tail=dummyvikas;
        
        int carryVikas=0;
        
        while(tempvikas!=null || tempvikas1!=null){
            
            int xvikas = (tempvikas!=null) ? tempvikas.val : 0;
            
            int yvikas = (tempvikas1!=null) ? tempvikas1.val : 0;
            
            int sumvikas = carryVikas + xvikas + yvikas;
            
            carryVikas = sumvikas/10;
            
            tail.next = new Node(sumvikas%10);
            
            tail=tail.next;
            
            if(tempvikas!=null)
                tempvikas=tempvikas.next;
                
            if(tempvikas1!=null)
                tempvikas1=tempvikas1.next;
                
        }
        
        if(carryVikas>0)
            tail.next=new Node(carryVikas);
        
        Node temp=dummyvikas;
        
        while(temp!=null){
            
            sb.append(temp.val);
            temp=temp.next;
            
        }
        
        String str=sb.reverse().toString();
        
        int x=0;
        
        for(x=0;x<str.length()-1;x++)
            System.out.print(str.charAt(x)+" ");
        
        
    }

    public static void main(String args[]){
    
        Scanner vikasbansal = new Scanner(System.in);
        
        Main llvikas = new Main();
        int nvikas = vikasbansal.nextInt(); 
        int nvikas1=vikasbansal.nextInt();
        
        for(int x=0;x<nvikas;){
            
            llvikas.insertatbegVikas(vikasbansal.nextInt());
            x++;
            
        }
        
        for(int x=0;x<nvikas1;){
            
            llvikas.insertatbegVikas1(vikasbansal.nextInt());
            x++;
            
        }
        
        llvikas.addVikas();
        
    }
    
    public void insertatbegVikas(int val){
        
        Node nvikas =new Node(val);
        
        if(headvikas==null){
            
            headvikas = nvikas;
            nvikas.next = null;
            
        }
        
        else{
            
            nvikas.next=headvikas;
            headvikas=nvikas;
            
        }
    }
    
    
    public void insertatbegVikas1(int val){
        
        Node nvikas=new Node(val);
        
        if(headvikas1==null){
            
            headvikas1=nvikas;
            nvikas.next=null;
            
        }
        
        else{
            
            nvikas.next=headvikas1;
            headvikas1=nvikas;
            
        }
    }
    
}
