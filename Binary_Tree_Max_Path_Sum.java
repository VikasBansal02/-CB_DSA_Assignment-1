import java.util.Arrays;
import java.lang.*;
import java.util.*;

public class Main 
{
    static Scanner rohitji=new Scanner(System.in);
    static int  maxRohit=-9999999;
    public static void main(String[] args) 
    {NodeRohit n=takeIp(0);okRohit(n);
    System.out.println(maxRohit);}
    static NodeRohit takeIp(int x)
    {String tRohit=rohitji.next();
        if(tRohit.equals("NULL")) {return null;}
        NodeRohit xRohit=new NodeRohit(Integer.parseInt(tRohit) );
        xRohit.leftRohit=takeIp(x+1);
        xRohit.rightRohit=takeIp(x+1);return xRohit;
    }
    
    
    static int okRohit(NodeRohit nRohit)
    {if(nRohit==null){return -9999999;}
        if(nRohit.leftRohit==null&&nRohit.rightRohit==null){return nRohit.dataRohit;}
            
        int s1Rohit=okRohit(nRohit.leftRohit);int s2Rohit=okRohit(nRohit.rightRohit);
        maxRohit=Math.max( Math.max(maxRohit,Math.max(s1Rohit,s2Rohit)),s1Rohit+s2Rohit +nRohit.dataRohit);
       
        return Math.max(Math.max(s1Rohit,s2Rohit) +nRohit.dataRohit,nRohit.dataRohit);}
        static void print(NodeRohit xRohit)
        {
            if(xRohit==null)
            {return;
                
            }
            System.out.print(xRohit.dataRohit+" ");
            print(xRohit.leftRohit);print(xRohit.rightRohit);}}
    class NodeRohit {
               int dataRohit;NodeRohit leftRohit;NodeRohit rightRohit;
               NodeRohit(int d){dataRohit=d;}
    }
