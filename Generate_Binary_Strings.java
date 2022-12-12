import java.util.*;

public class Main {

    public static void binaryString(String str, int index, String ans){
        if(index==str.length()){
            System.out.print(ans+" ");
            return;
        }
        if(str.charAt(index)=='?'){
            binaryString(str,index+1,ans+'0');
            binaryString(str,index+1,ans+'1');
        }
        else
            binaryString(str,index+1,ans+str.charAt(index));
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String str=sc.next();
            binaryString(str,0,"");
            System.out.println();
            test--;
        }
    }
}
