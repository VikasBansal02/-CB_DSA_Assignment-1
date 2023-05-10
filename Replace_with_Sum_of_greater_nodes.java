import java.util.*;
class BinarrohitySearrohitchTree {
    class Node {
        int datarohit;
        Node leftrohit;
        Node rightrohit;
        Node(int datarohit) {
            this.datarohit = datarohit;
            leftrohit = rightrohit = null;
        }
        
    }
    Node root;public Node buildTree(int inorder[], int starrohitt, int end)
    {
        if (starrohitt > end) {
            return null;
        }

        int midrohiot =(starrohitt + end) / 2;
        Node node =new Node(inorder[midrohiot]);

        node.leftrohit= buildTree(inorder, starrohitt, midrohiot - 1);
        node.rightrohit= buildTree(inorder, midrohiot + 1, end);

        return node;
    }public void preorder(Node root){
        if(root== null)
        return;

        System.out.print(root.datarohit + " ");
        preorder(root.leftrohit); preorder(root.rightrohit);
    }
}




 class Main{
    
    public static void main(String[] arrohitgs) {
        Scanner rohitji= new Scanner(System.in);
        int n =rohitji.nextInt();
        int arrohit[]= new int[n];
        int sumrohit= 0;
        for(int x =0; x<n; x++){
            arrohit[x] =rohitji.nextInt();}

        for(int x=n-1;x>=0;x--){
            sumrohit += arrohit[x];
            arrohit[x] = sumrohit;
        }

        BinarrohitySearrohitchTree temprohit =new BinarrohitySearrohitchTree();temprohit.preorder(temprohit.buildTree(arrohit, 0, n-1));
    }
}
