import java.util.*;

   public class Main {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner s = new Scanner(System.in);
    public Main(){
        this.root=CreateTree();
    }
    private Node CreateTree(){
        Queue<Node> q= new LinkedList<>();
        Node nn= new Node();
        int val=s.nextInt();
        nn.val=val;
        root=nn;
        q.add(root);
        while (!q.isEmpty()){
            Node rv=q.remove();
            int l=s.nextInt();int r=s.nextInt();
            if(l!=-1){Node node =  new Node();
            node.val=l;
            rv.left=node;
            q.add(node);
            } if(r!=-1){Node node =  new Node();
                node.val=r;
                rv.right=node;
                q.add(node);
            }
        }
        return root;
    }
     private boolean isSymmetric(Node root) {
//            TreeNode left=root.left;TreeNode right = root.right;
            return symm(root, root);
        }
        private boolean symm(Node node1, Node node2){
            if(node1==null && node2==null)return true;
            if(node1==null || node2==null)return false;
            if(node1.val!= node2.val)return false;
            boolean left = symm(node1.left,node2.right);
            boolean right = symm(node1.right , node2.left);
            return left && right;
        }

    public static void main(String[] args) {
        Main cl=new Main();
        if(cl.isSymmetric(cl.root))System.out.println("YES");
        else System.out.println("NO");
    }
}
