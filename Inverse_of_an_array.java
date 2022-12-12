import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int []arr=new int[num];
		int []temp=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
			temp[i]=arr[i];
		}
		for(int i=0;i<num;i++){
			int index=temp[i];
			arr[index]=i;
		}
		for(int i=0;i<num;i++)
			System.out.print(arr[i]+" ");
    }
}
