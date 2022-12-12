import java.util.*;

public class Main {

    public static int nthTriangle(int n){
        if(n==1)
            return 1;
        return n + nthTriangle(n-1);
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(nthTriangle(num));
    }
}
