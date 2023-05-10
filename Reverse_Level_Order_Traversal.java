import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.RLO();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void RLO() {
			this.RLO(this.root);
		}

		private void RLO(Node root) {
			// write your code here
			Queue<Node> q=new LinkedList<>();
               ArrayList<Integer> ans=new ArrayList<>();
               q.add(root);
               while(!q.isEmpty())
               {
                    Node c=q.poll();
                    ans.add(c.data);
                    if(c.right!=null) q.add(c.right);
                    if(c.left!=null) q.add(c.left);
               }
               Collections.reverse(ans);
               for(int i:ans)
               {
                    System.out.print(i+" ");
               }
		}

	}

}
