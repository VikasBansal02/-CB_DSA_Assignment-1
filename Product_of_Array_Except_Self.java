import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        long []left=new long[size];
        long []right=new long[size];
        left[0]=1;
        right[size-1]=1;
        for(int i=1,j=size-2;i<size && j>=0;i++,j--){
            left[i]=(left[i-1]*arr[i-1]);
            right[j]=(right[j+1]*arr[j+1]);
        }
        for(int i=0;i<size;i++)
            System.out.print((long)left[i]*right[i]+" ");

    }
}
