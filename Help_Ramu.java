import java.util.*;
public class Main {
    

    public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int testvikas=sc.nextInt();
		for(int i=0;i<testvikas;i++){
			int ticketprice[]=new int[4];
			for(int x=0;x<ticketprice.length;x++)
			    ticketprice[x]=sc.nextInt();
			
			int rickshawno=sc.nextInt();
			int cabsno=sc.nextInt();

			int rickshawnumber[]=new int[rickshawno];
			for(int x=0;x<rickshawno;x++)
			{
			    rickshawnumber[x]=sc.nextInt();
			}
			int cabsnumber[]=new int[cabsno];
			for(int x=0;x<cabsno;x++)

			    cabsnumber[x]=sc.nextInt();
			
			int totalrickshawCost=0;
			
			for(int x=0;x<rickshawno;x++)
			{
			    totalrickshawCost+=Math.min(ticketprice[0]*rickshawnumber[x],ticketprice[1]);
			}
			totalrickshawCost=Math.min(totalrickshawCost,ticketprice[2]);
			
			int totalcabCost=0;
			
			for(int x=0;x<cabsno;x++)
			
			{
			    totalcabCost+=Math.min(ticketprice[0]*cabsnumber[x],ticketprice[1]);
			}
			totalcabCost=Math.min(totalcabCost,ticketprice[2]);
			int totalprice=Math.min((totalrickshawCost+totalcabCost),ticketprice[3]);
			
			System.out.println(totalprice);

		}

    }
}
