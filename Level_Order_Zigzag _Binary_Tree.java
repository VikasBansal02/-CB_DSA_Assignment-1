import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			
			// write your code here
			if(root==null) return;
			Queue<Node> q=new LinkedList<>();
			q.offer(root);
			boolean rev=false;
			while(!q.isEmpty())
			{
				List<Integer> ans=new ArrayList<>();
				int size=q.size();
				for(int i=0;i<size;i++)
				{
					Node c=q.poll();
					ans.add(c.data);
					if(c.left!=null)
					{
						q.offer(c.left);
					}
					if(c.right!=null)
					{
						q.offer(c.right);
					}
				}
				if(rev) Collections.reverse(ans);
				for(int i :ans)
				{
					System.out.print(i+" ");
				}
				rev=!rev;
			}
		}

	}

}
