import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner mohitsaxena= new Scanner(System.in);
        int nmohit=mohitsaxena.nextInt();
        int dp_mohit[]= new int[nmohit+ 1];
        dp_mohit[0] = 1;
        dp_mohit[1] = 1;
        for (int x= 2;x<=nmohit;x++)
        {
            dp_mohit[x] = dp_mohit[x-1]+ dp_mohit[x-2];
        }
        System.out.println(dp_mohit[nmohit]);
        
    }
}
