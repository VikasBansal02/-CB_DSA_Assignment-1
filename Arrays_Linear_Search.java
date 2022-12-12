import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int []arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		int m=sc.nextInt();
		int index=-1;
		for(int i=0;i<num;i++){
			if(arr[i]==m){
				index=i;
				break;
			}
		}
		if(index>0)
			System.out.println(index);
		else
			System.out.println(index);
    }
}
