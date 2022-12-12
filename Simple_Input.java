import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int sum=0,c=0;
        int arr[]= new int[10000]; 
		while(true){
		    int n = sc.nextInt();
		    sum+=n;
		    if(sum<0){
		        break;
		    }
		    arr[c]=n;
		    c++;
		}
		for(int i=0;i<c;i++)
		    System.out.println(arr[i]);
    }
}
