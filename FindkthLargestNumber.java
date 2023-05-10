
	
			
			import java.util.*;	

				


public class Main {	


    public static void main (String args[]) {	

			Scanner vikas_scan = new Scanner(System.in);

			int vikas_size = vikas_scan.nextInt();			

			int vikas_kth = vikas_scan.nextInt();	

			int []vikas_Arr = new int[vikas_size];					

			for(int vikas = 0; vikas < vikas_size; vikas++){			

					vikas_Arr[vikas] = vikas_scan.nextInt();



			}

		Arrays.sort(vikas_Arr);


			for(int vikas = vikas_Arr.length-1; vikas >= 0; vikas--){

				vikas_kth--;
				if(vikas_kth == 0){
					
						System.out.println(vikas_Arr[vikas]);


						break;
				}

			}

    }
}
