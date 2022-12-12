import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        while(row<=n){
            int j=1;
            while(j<=row){
                if(j<2 || j==row)
                    System.out.print(row+"\t");
                else
                    System.out.print("0\t");
                j++;
            }
            row++;
            System.out.println();
        }
    }
}
