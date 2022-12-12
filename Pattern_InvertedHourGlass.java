import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,r1=1,space=2*n-1;
		while(row<=2*n +1 ){
		    int j=1,r=n;
		    while(j<=r1){
		        System.out.print(r+" ");
		        r--;
		        j++;
		    }
		    int i=1;
		    while(i<=space){
		        System.out.print("  ");
		        i++;
		    }
		    j=1;
		    if(r<0)
		        r++;
		    r++;
		    while(j<=r1){
		        System.out.print(r+" ");
		        if(r>=n)
		            break;
		        r++;
		        j++;
		    }
		    if(row>n){
		        r1--;
		        space+=2;
		    }
		    else{
		        space-=2;
		        r1++;
		    }
		    row++;
		    System.out.println();
		}
    }
}
