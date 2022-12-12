import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,space=n-1,c=1;
		while(row<=n){
		    int i=1;
		    while(i<=space){
		        System.out.print("\t");
		        i++;
		    }
		    int j=1;
		    while(j<=row*2-1){
		        System.out.print(c+"\t");
		        if(j<row){
		            c++;
		            j++;
		        }
		        else{
		            c--;
		            j++;
		        }
		    }
		    c=row+1;
		    space--;
		    row++;
		    System.out.println();
		}
		
    }
}
