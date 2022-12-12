import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1,a=0,b=1;
        while(row<=n){
            int j=1;
            while(j<=row){
                if(row==1){
                    System.out.print(a+"\t");
                    j++;
                    continue;
                }
                else if(row==2){
                    System.out.print(b+"\t");
                    j++;
                    a=b;
                    continue;
                }
                int c=a+b;
                a=b;
                b=c;
                System.out.print(c+"\t");
                j++;
            }
            row++;
            System.out.println();
        }
		
    }
}
