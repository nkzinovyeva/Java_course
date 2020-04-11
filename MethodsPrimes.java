

import java.util.Scanner;

public class MethodsPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many primes: ");
		int x = Integer.parseInt(input.nextLine());
		
		int counter = 1;
		int i = 2;
		String numbers = "";
		
		while (counter <= x) {
			if (isPrime(i) == true) {		
				numbers += i + " ";
				counter++;
			}
			i++;			
		}
		System.out.print(numbers);
		input.close();
	}

	public static boolean isPrime(int x) {
		if (x <= 1) {  
	           return false;  
	       }  
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
