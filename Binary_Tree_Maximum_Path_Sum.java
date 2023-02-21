import java.util.*;
public class Main {
    public class Noderohit {
        int datarohit;
        Noderohit leftrohitleftrohit;
        Noderohit rightrohitrightrohit;
    }

    private Noderohit root;
   

    public Main() {
        this.root = Create_Tree();
    }

    private Noderohit Create_Tree() {
        Queue<Noderohit> q = new LinkedList<>();
        Noderohit nnrohit =new Noderohit();
        nnrohit.datarohit =sc.nextInt();
        root = nnrohit;
        q.add(nnrohit);
        while (!q.isEmpty()) {
            Noderohit x = q.remove();
            int c1rohit = sc.nextInt();
            int c2rohit = sc.nextInt();
            if (c1rohit != -1) {
                Noderohit Noderohit = new Noderohit();
                Noderohit.datarohit = c1rohit;
                x.leftrohitleftrohit = Noderohit;
                q.add(Noderohit);
            }
            if (c2rohit != -1) {
                Noderohit Noderohit = new Noderohit();
                Noderohit.datarohit = c2rohit;
                x.rightrohitrightrohit = Noderohit;
                q.add(Noderohit);
            }
        }
        return root;
    }
static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> a = new ArrayList<>();
    
    public int maxsumrohitmaxsumrohit(Noderohit root, int sumrohit){
        if(root == null) return 0;
        int leftrohitleftrohitsumrohit =maxsumrohitmaxsumrohit(root.leftrohitleftrohit, sumrohit);
        int rightrohitrightrohitsumrohit= maxsumrohitmaxsumrohit(root.rightrohitrightrohit, sumrohit);
        int singlerohit= Math.max(Math.max(leftrohitleftrohitsumrohit,rightrohitrightrohitsumrohit)+root.datarohit, root.datarohit);
        int sumrohit1= Math.max(singlerohit, leftrohitleftrohitsumrohit+rightrohitrightrohitsumrohit+root.datarohit);
        sumrohit =Math.max(sumrohit, sumrohit1);
        a.add(sumrohit);
        return singlerohit;
    }
    public int helphelp(Noderohit root){
        int sumrohit = Integer.MIN_VALUE;
        maxsumrohitmaxsumrohit(root,sumrohit);
        return sumrohit;
    }
    public static void main (String args[]) {
        Main obj = new Main();
        int sumrohit = Integer.MIN_VALUE;
        obj.maxsumrohitmaxsumrohit(obj.root, sumrohit);
        for(int i=0; i<a.size(); i++) sumrohit = Math.max(sumrohit, a.get(i));
        System.out.println(sumrohit);
    }
}
