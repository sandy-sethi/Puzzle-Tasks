/*
find the number of ways to represent it as a sum of two or
more consecutive positive integers.
*/

import java.util.Scanner; 

public class ConsecutiveSum 
{    
    // Method to compute the number of ways to represent it as a sum of two or
	//more consecutive positive integers
    static int countConsecutive(int N)
    {
        int count = 0;
        for (int L = 1; L * (L + 1) < 2 * N; L++)
        {
            float a = (float) ((1.0 * N-(L * (L + 1)) / 2) / (L + 1));
            if (a-(int)a == 0.0) 
                count++;        
        }
        return count;
    }
     
    // Main
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int N = reader.nextInt(); // Scans the next token of the input as an int.
		reader.close(); 
        System.out.println("The Consecutive Sum is : "+countConsecutive(N));
        
    }
}