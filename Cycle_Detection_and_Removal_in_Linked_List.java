import java.util.*;

class Node {
    public int data;
    public Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    // private Node head;
    // head - Head pointer of the Linked List
    // Return a boolean value indicating the presence of cycle
    // If the cycle is present, modify the linked list to remove the cycle as well
    public Node hasCyclevikas(Node headvikas){
        Node slowvikas = headvikas;
        Node fastvikas = headvikas;
        while(fastvikas!=null && fastvikas.next!=null){
            fastvikas=fastvikas.next.next;
            slowvikas=slowvikas.next;
            if(slowvikas==fastvikas)
                return slowvikas;
        }
        return null;
    }

    boolean floydCycleRemoval(Node headvikas) {
        
        Node meetupvikas= hasCyclevikas(headvikas);
        if(meetupvikas==null){
            return false;
        }
        Node fastvikas = meetupvikas;
        Node startvikas = headvikas;
        while(startvikas.next!=fastvikas.next){
            startvikas=startvikas.next;
            fastvikas=fastvikas.next;
        }
        fastvikas.next=null;
        return true;
    }

}


/*
*
*
*   You do not need to refer or modify any code below this. 
*   Only modify the above class definition.
*	Any modications to code below could lead to a 'Wrong Answer' verdict despite above code being correct.
*	You do not even need to read or know about the code below.
*
*
*
*/

public class Main {

    public static Node buildCycleList() {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, Node> hash = new Hashtable<Integer, Node>();
        int x = sc.nextInt();
        if (x == -1) {
            return null;
        }
        Node head = new Node(x);
        hash.put(x, head);
        Node current = head;
        while (x != -1) {
            x = sc.nextInt();
            if (x == -1)
                break;
            if (hash.containsKey(x)) {
                current.next = hash.get(x);
                return head;
            }
            Node n = new Node(x);
            current.next = n;
            current = n;
            hash.put(x, n);
        }
        current.next = null;
        return head;
    }

    public static void printLinkedList(Node head) {
        HashSet<Integer> s = new HashSet<Integer>();
        while (head != null) {
            if (s.contains(head.data)) {
                System.out.println("\nCycle detected at " + head.data);
                return;
            }
            System.out.print(head.data + " ");
            s.add(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = buildCycleList();
        Solution s = new Solution();

        boolean cyclePresent = s.floydCycleRemoval(head);
        if (cyclePresent) {
            System.out.println("Cycle was present");
        } else {
            System.out.println("No cycle");
        }

        System.out.print("Linked List - ");
        printLinkedList(head);
    }
}
