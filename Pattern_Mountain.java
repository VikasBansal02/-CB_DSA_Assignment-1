 import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,space=2*n-3;
		while(row<=n){
		    int i=1;
		    while(i<=row){
		        System.out.print(i+"\t");
		        i++;
		    }
		    int j=1;
		    while(j<=space){
		        System.out.print("\t");
		        j++;
		    }
		    int c=row;
		    i=1;
		    while(i<=row){
		        if(row==n && i==1){
		            c--;
		            i++;
		            continue;
		        }
		        System.out.print(c-- +"\t");
		        i++;
		    }
		    space-=2;
			row++;
		    System.out.println();
		}
    }
}
