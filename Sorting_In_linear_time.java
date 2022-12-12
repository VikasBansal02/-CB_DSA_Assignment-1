import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int c=0;
		int []temp=new int[size];
		for(int i =0;i<3;i++){
			for(int j=0;j<size;j++){
				if(i==arr[j]){
					temp[c++]=i;
				}
			}
		}
		arr=temp;
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
    }
}
