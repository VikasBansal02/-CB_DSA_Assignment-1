import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,s1=n-1,a=1,s2=0;
		while(row<=n){
		    int j=1;
		    while(j<=s1){
		       System.out.print("  ");
		       j++;
		    }
		    int i=1,num=a;
		    while(i<=a){
		        System.out.print(num+" ");
		        num--;
		        i++;
		    }
		    j=1;
		    while(j<=s2){
		       System.out.print("  ");
		       j++;
		    }
		    i=1;
		    while(i<=a){
		        if((row==1 || row==n) && i==1){
		            i++;
		            continue;
		        }
		        System.out.print(++num+" ");
		        i++;
		    }
		    if(row<n/2+1){
		        s1-=2;
		        s2=2*row-1;
		        a=row+1;
		    }
		    else{
		        s1+=2;
		        s2-=2;
		        a--;
		    }
		    
		    row++;
		    System.out.println();
		}
    }
}
