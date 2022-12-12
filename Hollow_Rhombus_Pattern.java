import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,space=n-1;
		while(row<=n){
		    int i=1;
		    while(i<=space){
		        System.out.print("  ");
		        i++;
		    }
		    int j=1;
		    while(j<=n){
		        if(row==1 || row==n)
		            System.out.print("*");
		        else{
		            if(j==1 || j==n)
		                System.out.print("*");
		            else
		                System.out.print(" ");
		        }
		        j++;
		    }
		    space--;
		    row++;
		    System.out.println();
		}
    }
}
