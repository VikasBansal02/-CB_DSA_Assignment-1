import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		String str[]=new String[t];
		for(int j=0;j<t;j++){
		    int arr[]=new int[2];
		    int sa=0,sh=0;
		    for(int i=0;i<2;i++){
		        arr[i]=sc.nextInt();
		    }
		  	for(int i=1,x=2;i<=arr[0] || x<=arr[1];i+=2,x+=2){
		  	    if((sa+i)<=arr[0])
		  	        sa+=i;
		        else
		            break;
		        if((sh+x)<=arr[1])
		            sh+=x;
		        else
		            break;
		    }
		    if(sa>sh)
		        str[j]="Aayush";
		    else
		        str[j]="Harshit";
		}
		for(int j=0;j<t;j++)
		    System.out.println(str[j]);
    }
}
