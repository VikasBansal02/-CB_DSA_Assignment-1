import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,space=n-1,a=1;
		while(row<=2*n-1){
		    int j=1;
		    while(j<=space){
		        System.out.print("\t");
		        j++;
		    }
		    int i=1,c=a;
		    while(i<=2*a-1){
		        System.out.print(c+"\t");
		        if(i<a)
		            c++;
		        else
		            c--;
		        i++;
		    }
		    if(row<n){
		        space--;
		        a=row+1;
		      //  System.out.println(c);
		    }
		    else{
		        space++;
		        a--;
		      //  System.out.println(c);
		    }
		    row++;
		    System.out.println();
		}
    }
}
