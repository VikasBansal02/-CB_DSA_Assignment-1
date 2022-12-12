import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        long num=sc.nextLong();
        if(num==0 || num==1)
                System.out.println(num);
        else
                System.out.println(squareroot(num));
        }

        public static long squareroot(long num){
                long lo=1,hi=num,mid=0;
                while(lo<=hi){
                        mid=(lo+hi)/2;
                        if((mid*mid <= num) && ((mid+1)*(mid+1)>num)){
                                return mid;
                        }
                        else if(mid*mid<num){
                                lo=mid+1;
                        }
                        else
                                hi=mid-1;

                }
                return lo;
        }
}
