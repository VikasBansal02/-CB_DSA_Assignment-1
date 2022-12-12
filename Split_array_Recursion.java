import java.util.*;
public class Main
{
    static int c = 0;
    public static void sub_set(int sum1,String ans1,int sum,String ans,int i,int array[]) {
		if (i == array.length) {
			if (sum == sum1) {
				System.out.println(ans + "and " + ans1);
				c++;
		    }
		    return;
	    }
	    sub_set(sum1,ans1,sum + array[i],ans + array[i] + " ",i + 1,array);
	    sub_set(sum1 + array[i],ans1 + array[i] + " ",sum,ans,i + 1,array);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nu = scan.nextInt();
		int[] array = new int[nu];
		for (int i = 0; i < nu; i++)
			array[i] = scan.nextInt();
		sub_set(0,"",0,"",0,array);
		System.out.println(c);
	}
}
