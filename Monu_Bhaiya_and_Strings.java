import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String myString=sc.next();
        int[] freqArr=new int[26];
        for(int i=0;i<myString.length();i++){
            freqArr[myString.charAt(i)-'a']=i;
        }
        boolean[] track=new boolean[26];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<myString.length();i++){
            int j=myString.charAt(i)-'a';
            if(track[j]){
                continue;
            }
            while(!st.isEmpty() && st.peek()>j && i<freqArr[st.peek()]){
                track[st.pop()]=false;
            }
            st.push(j);
            track[j]=true;
        }
        String ans="";
        while(!st.isEmpty()){
            ans=(char)(st.pop()+'a')+ans;
        }
        System.out.print(ans);
    }
}
