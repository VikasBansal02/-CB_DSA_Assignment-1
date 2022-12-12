// ncr= fac(n)/fac(n-r)*fac(r);
import java.util.*;
public class Main {
    static int factorial(int n) {
        int f;
        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int n=sc.nextInt();
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j <= i; j++){
                System.out.print(ncr(i, j)+"\t");
            }
            System.out.println();
        }
    }
}
