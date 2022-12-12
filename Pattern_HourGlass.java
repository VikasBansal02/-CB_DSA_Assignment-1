import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,num=n,space=0;
		while(row<=n*2+1){
		    int i=1;
		    while(i<=space){
		        System.out.print("  ");
		        i++;
		    }
		    int j=0,c=num,d=num;
		    while(j<=2*num){
		        if(j<=d){
		            System.out.print(c+" ");
		            c--;
		            j++;
		        }
		        else{
		            if(c<0){
		                c=1;
		            }
		            System.out.print(c+" ");
		            c++;
		            j++;
		        }
		    }
		  //  j=1;
		  //  while(j<=num){
		  //      System.out.print(j+" ");
		  //      j++;
		  //  }
		    if(row<=n){
		        space++;
		        num--;
		    }
		    else{
		        space--;
		        num++;
		    }
		    row++;
		    System.out.println();
		}
    }
}
