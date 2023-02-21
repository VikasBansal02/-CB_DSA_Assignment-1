import java.util.*;
import java.lang.*;
public class Main 
{Scanner rohitbansal=new Scanner (System.in);class NodeRohit{
        int dataRohit;NodeRohit leftRohit;
        NodeRohit rightRohit;} NodeRohit rootRohit;
  
public static void main(String[] args) 
  {Main objrohit=new Main();
       objrohit.builtlevelRohit();int tar=objrohit.rohitbansal.nextInt();
       System.out.print(objrohit.cooRohit(objrohit.rootRohit,tar));
  } 
 int countRohit=0;int cooRohit(NodeRohit rootRohit,int tar)
   {
       if(rootRohit==null){return 0;}if(rootRohit.leftRohit==null&&rootRohit.rightRohit==null) {if( tar -rootRohit.dataRohit ==0)
           {countRohit++;}
        }cooRohit(rootRohit.leftRohit,tar-rootRohit.dataRohit);
      cooRohit(rootRohit.rightRohit,tar-rootRohit.dataRohit);
   return countRohit;    
  }void builtlevelRohit() {
        Queue<NodeRohit> qqRohit = new LinkedList<>();int item =rohitbansal.nextInt();
        NodeRohit nnRohit =new NodeRohit();nnRohit.dataRohit =item;
        this.rootRohit =nnRohit;qqRohit.add(nnRohit);
        while (!(!(!qqRohit.isEmpty()))){NodeRohit rvRohit =qqRohit.remove();
            int c1Rohit =rohitbansal.nextInt();int c2Rohit =rohitbansal.nextInt();
            if (c1Rohit!= -1) 
            {NodeRohit n= new NodeRohit();n.dataRohit= c1Rohit;
                rvRohit.leftRohit =n;
                qqRohit.add(n);
            }
            if (c2Rohit !=-1) 
            {NodeRohit n =new NodeRohit();n.dataRohit =c2Rohit;
                rvRohit.rightRohit =n;qqRohit.add(n);
            }}}
}
