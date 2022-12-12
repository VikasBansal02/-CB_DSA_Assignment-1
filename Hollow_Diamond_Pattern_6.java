import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,space=0,star=n/2+1;
		while(row<=n){
		    int i=1;
		    while(i<=star){
		        System.out.print("*\t");
		        i++;
		    }
		    int j=1;
		    while(j<=space){
		       System.out.print("\t");
		       j++;
		    }
		    i=1;
		    while(i<=star){
		        if((row==1 || row==n) && i==1 ){
		            i++;
		            continue;
		        }
		        System.out.print("*\t");
		        i++;
		    }
		    if(row<n/2+1){
		        star--;
		        space=2*row -1;
		    }
		    else{
		        star++;
		        space-=2;
		    }
		    row++;
		    System.out.println();
		}
    }
}
