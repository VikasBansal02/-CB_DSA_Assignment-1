import java.util.*;
public class Main {

	public static int find(int []arr,int length,int item){
        if(length==arr.length)
            return -1;
        
        if(arr[length]==item ){
            return length;
        }
        else
            return find(arr,length+1,item);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		System.out.println(find(arr,0,target));
    }
}
