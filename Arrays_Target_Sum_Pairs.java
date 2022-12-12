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
        target(arr,num);
    }

    public static void target(int []arr,int num){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i]+arr[j+1] == num){
                    if(arr[i]<arr[j+1])
                        System.out.println(arr[i]+" and "+arr[j+1]);
                    else
                        System.out.println(arr[j+1]+" and "+arr[i]);
                }
            }
        }
    }
}
