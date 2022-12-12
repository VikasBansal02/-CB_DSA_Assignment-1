import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int lo=0,hi=num-1,index=-1;
		while(lo<=hi){
		    int mid=(lo+hi)/2;
		    if(arr[mid]==target){
		        index=mid;
		        break;
		    }
		    else if(arr[mid]>target)
		        hi=mid-1;
		    else
		        lo=mid+1;
		}
		if(target>=0)
		    System.out.println(index);
		else
		    System.out.println(index);
    }
}
