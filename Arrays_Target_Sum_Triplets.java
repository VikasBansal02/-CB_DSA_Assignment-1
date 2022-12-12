import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();      //Size of the array
        int []arr=new int[size];    //Array Initialization
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();    // Array elements
        }
        int num=sc.nextInt();       // Number to find whose Pairs
		Arrays.sort(arr);
        triplet(arr,num);
    }

    public static void triplet(int []arr,int num){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k] == num)
                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
				}
            }
        }
    }
}
