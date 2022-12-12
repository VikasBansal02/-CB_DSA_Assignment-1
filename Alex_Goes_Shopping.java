import java.util.*;
public class Main {
	
    public static void main(String args[]) {
		Scanner ms=new Scanner(System.in);
		int number=ms.nextInt();
		int arr[]=new int[number];
		for(int x=0;x<arr.length;x++){
			arr[x]=ms.nextInt();
		}
		int test=ms.nextInt();
		for(int x=0;x<test;x++){
			int price=ms.nextInt();
			int arrquantity=ms.nextInt();
			purchaseitem(arr , price , arrquantity);
		}

    }
public static void purchaseitem(int price[], int queryPricing , int queryquantities){
		int c=0;
		for(int x=0;x<price.length;x++){
			if(queryPricing % price[x]==0){
				c++;
			}
			
		}
		if(c>=queryquantities){
				System.out.println("Yes");

			}
			else{
				System.out.println("No");
			}
	}

}
