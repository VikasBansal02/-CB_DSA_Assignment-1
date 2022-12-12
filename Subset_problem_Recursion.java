import java.util.*;
public class Main{
    
    public static int Subset_problem_Recursion(int []arr,int sum,int x,int target,String ans){
        
        if (x==arr.length) {
            if (sum==target){
                System.out.print(ans + " ");
            return 1;
            }
            
            return 0;
            
        }
        
        int fs = Subset_problem_Recursion(arr,sum+arr[x],x+1,target,ans+arr[x]+" ");
        int ss = Subset_problem_Recursion(arr,sum, x+1, target,ans);
        return fs + ss;
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int []arr=new int[num];
        int a=0;
        while(a<num){
            arr[a]=scan.nextInt();
            a++;
        }
        int target=scan.nextInt();
        System.out.println("\n"+ Subset_problem_Recursion(arr, 0, 0, target,""));
    }
    
}
