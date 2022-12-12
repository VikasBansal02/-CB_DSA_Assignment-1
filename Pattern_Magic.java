import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1,star=n,space=0;
        while(row<=2*n-1){
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            j=1;
            while(j<=star){
                if((row==1 || row==2*n-1) && j==1){
                    j++;
                    continue;
                }
                System.out.print("*");
                j++;
            }
            if(row<n){
                space=2*row-1;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            row++;
            System.out.println();
        }
		
    }
}
