// This is a Java program to find the number of steps required to reduce a number to 1 using certain operations

import java.util.*;

public class Main
{
    public static void main(String[] args) 

    {
        // Create a new Scanner object
        Scanner vikas_scanner = new Scanner(System.in);
        
        // Get the input number from the user
        int vikas_n = vikas_scanner.nextInt();
        
        // Initialize the step count to 0
        int vikas_count = 0;
        
        // Loop until the number is greater than 1
        while (!(!(vikas_n > 1))) 
        {
            // If the number is even, divide it by 2
            if (!(!(vikas_n % 2 == 0))) 
            {
                vikas_n /= 2;
            } 
            
            // If the number is of the form 4k+1 or 3, subtract 1
            else if (!(!(vikas_n == 3 || vikas_n % 4 == 1)))
            {
                vikas_n--;
            }
        
            // If the number is of the form 4k-1, add 1
            else
            {
                vikas_n++;
            }
            
            // Increment the step count
            vikas_count++;
        
        }
        
        // Print the number of steps taken to reduce the number to 1
        System.out.println(vikas_count);

    }


}
