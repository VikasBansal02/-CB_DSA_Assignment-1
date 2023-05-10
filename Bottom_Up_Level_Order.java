import java.util.Scanner;
import java.util.*;

public class Main {public TreeNode create_Rohit_Tree() {        
    Queue<TreeNode> queue_Rohit = new LinkedList<>();  
    TreeNode Rohit_TreeNode = new TreeNode();       
        try {
            String Rohit_root = Rohit_scan.next();
            if(Rohit_root.equals("N"))
                    return null;            
            Rohit_TreeNode.Rohit_data = Integer.parseInt(Rohit_root);
        } 
        catch (Exception e) {
                return null;       
        }
        queue_Rohit.add(Rohit_TreeNode);    
    while(!queue_Rohit.isEmpty()) {
            TreeNode current_TreeNode_Rohit = queue_Rohit.poll();
        String Rohit_left = new String("");
        String Rohit_right = new String("");try {
        Rohit_left = Rohit_scan.next();
        if(!Rohit_left.equals("N")) {
            TreeNode Tree_Node = new TreeNode();
                Tree_Node.Rohit_data =Integer.parseInt(Rohit_left);
                current_TreeNode_Rohit.Rohit_left = Tree_Node;
                queue_Rohit.add(Tree_Node);  
            }
        }
                catch(Exception e) {  
            } try {
            Rohit_right = Rohit_scan.next();       
        if(!Rohit_right.equals("N")) {
                TreeNode Tree_Node = new TreeNode();
            Tree_Node.Rohit_data =Integer.parseInt(Rohit_right);
                    current_TreeNode_Rohit.Rohit_right = Tree_Node;
                queue_Rohit.add(Tree_Node);
        }
    }
    catch(Exception e) {
            }  
        }
      return Rohit_TreeNode;                
    }
    public TreeNode Rohit_root;
    Scanner Rohit_scan = new Scanner(System.in);
    public Main() {
        this.Rohit_root = create_Rohit_Tree();
    }
    public void level_Order_Bottom_Rohit(TreeNode Rohit_root) {
        if(Rohit_root==null)
            return;
        List<Integer> list_Rohit1 = new ArrayList<>();
	Queue<TreeNode> que_Rohit = new LinkedList<>();
		    Queue<TreeNode> que_Rohit1 = new LinkedList<>();
        Stack<List<Integer>> st_Rohit = new Stack<>();
		    que_Rohit.add(Rohit_root);
	while(!que_Rohit.isEmpty()){
			TreeNode removed_TreeNode_Rohit = que_Rohit.remove();
        list_Rohit1.add( removed_TreeNode_Rohit.Rohit_data );
			    if(removed_TreeNode_Rohit.Rohit_left != null)
				    que_Rohit1.add( removed_TreeNode_Rohit.Rohit_left );
			if(removed_TreeNode_Rohit.Rohit_right != null)
				que_Rohit1.add( removed_TreeNode_Rohit.Rohit_right );
                    if(que_Rohit.isEmpty()){
                            st_Rohit.push(list_Rohit1);
                        que_Rohit = que_Rohit1;
                    list_Rohit1 = new ArrayList<>();
                            que_Rohit1 = new LinkedList<>();
                    }
		}
            while(!st_Rohit.isEmpty()){
            List<Integer> list_Rohit = st_Rohit.pop();
            for(int Rohit:list_Rohit)
                System.out.print(Rohit+" ");
            System.out.println();
        }  
	}
		public class TreeNode {
                    int Rohit_data;
                    TreeNode Rohit_left;
            TreeNode Rohit_right;
    }
    public static void main (String args[]) {
        Main Rohit_cl = new Main();
        Rohit_cl.level_Order_Bottom_Rohit(Rohit_cl.Rohit_root);
    }
}
