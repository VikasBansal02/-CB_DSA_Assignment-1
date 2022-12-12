import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int []arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		for(int i=0,j=num-1;i<=num/2 && j>=num/2;i++,j--){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<num;i++)
			System.out.println(arr[i]);
    }
}
