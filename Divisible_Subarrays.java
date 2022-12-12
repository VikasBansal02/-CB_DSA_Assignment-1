import java.util.*;
public class Main {
    public static long SubarraySum(int arr[],int n) {
        long s=0;
        int[] freq=new int[arr.length];
        freq[0]=1;
        for(int i=0;i<freq.length;i++){
            s+=arr[i];
            int index=(int)(s%n);
            if(index<0){
                index+=n;
            }
            freq[index]+=1;
        }
        long ans=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>=2){
                long p=freq[i];
                ans+=(p*(p-1)/2);
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[] = new int[n];
            for(int x=0;x<n;x++){
                arr[x]=sc.nextInt();
            }
            System.out.println(SubarraySum(arr,n));
            
        }
        
    }
}
