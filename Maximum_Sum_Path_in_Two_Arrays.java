import java.util.*;
public class Main {
		

    public static void main(String args[]) 
	{
		Scanner ms=new Scanner(System.in);
		int testarrr=ms.nextInt();
		for(int i=0;i<testarrr;i++){
			int arrrn=ms.nextInt();
			int arrrm=ms.nextInt();
         int arrr1[]=new int[arrrn];
		 for(int x=0;x<arrrn;x++){
			arrr1[x]=ms.nextInt();
		 }
		 int arrr2[]=new int[arrrm];
		for(int x=0;x<arrrm;x++){
			arrr2[x]=ms.nextInt();
		 }
		 
		 int counter1=0;
		int counter2=0;
		int sum1=0;
		int sum2=0;
		int res=0;
		while(true){
         
			if(arrr1[counter1]>arrr2[counter2])
			{
				sum2+=arrr2[counter2];
				counter2++;
			}
			else if(arrr1[counter1]<arrr2[counter2]){
				sum1+=arrr1[counter1];
				counter1++;

			}
         else{
				res+=Math.max(sum1,sum2);
            res+=arrr1[counter1];
            counter1++;
            
            counter2++;
        
         sum1=0;
         sum2=0;
         }
         if(counter1!=arrr1.length && counter2==arrr2.length){
            for(int z=counter1;z<arrr1.length;z++){
               res+=arrr1[counter1];
               counter1++;
         }
         }
          else if(counter1==arrr1.length && counter2!=arrr2.length){
            for(int z=counter2;z<arrr2.length;z++){
               res+=arrr2[counter2];
               counter2++;
         }
          }
             if(counter1==arrr1.length && counter2==arrr2.length){
               break;
         }
             }
             System.out.println(res);
		}
         
		}
}
