import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int [][]store=new int[test][1000];
		int []store_size=new int[test];
		int c=0;
		while(test>0){
			int size =sc.nextInt();
			int []nums=new int[size];
			for(int i=0;i<size;i++)
				nums[i]=sc.nextInt();
			int p=0;
        	for(int i=nums.length-2;i>=0;i--){
            	if(nums[i]<nums[i+1]){
                	p=i;
                	break;
            	}
        	}
        	int q=0;
        	for(int i=nums.length-1;i>p;i--){
            	if(nums[i]>nums[p]){
                	q=i;
                	break;
            	}
        	}
        	if(p==0 && q==0){
            	Range_reverse(nums,0,nums.length-1);
        	}
        	else{
        	    //swap index p and q
        	    int temp=nums[p];
        	    nums[p]=nums[q];
        	    nums[q]=temp;
        	    Range_reverse(nums,p+1,nums.length-1);
        	}
			store_size[c]=size;
			store[c++]=nums;
			test--;
    	}
		for(int i=0;i<c;i++){
			for(int j=0;j<store_size[i];j++)
				System.out.print(store[i][j]+" ");
			System.out.println();
		}
	}
	public static void Range_reverse(int[] nums,int i,int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
	}
}
