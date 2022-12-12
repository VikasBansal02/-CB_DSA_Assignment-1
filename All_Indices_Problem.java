import java.util.*;
public class Main {

	public static void find(int []arr,int length,int item,int found){
        if(found==0 && length==arr.length){
			System.out.print(-1);
			return;
		}
        else if(length==arr.length){
            return;
        }
        if(arr[length]==item ){
            System.out.print(length+" ");
			find(arr,length+1,item,found+1);
        }
        else
            find(arr,length+1,item,found);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		find(arr,0,target,0);
    }
}
