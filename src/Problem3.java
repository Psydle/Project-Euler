/*
 * Project 3
 * Largest Prime Factor
 * The Prime Factors of 13195 are 5, 7, 13 and 29
 * What is the largest prime factor of 600851475143?
 * 
 * May 12, 2017
 * Luke Young
 */
public class Problem3 {
	public static long number;
	public static int largest;
	public static int root;

	public static void main(String[] args) {
		//number = 501;
		number = 600851475143L;
		largest = 0;
		System.out.println(number);

		// test small primes to reduce value quickly
		for (int i = 2; i < 168; i++) {
			if (number % i == 0) {
				number = number / i;
				largest = i;
			}
		}
		System.out.println(number);
		System.out.println(largest);
		
		//find root of new number to find primes up to
		root = (int) Math.sqrt(number) + 1;
		System.out.println(root);
		
		//find all prime factors
		for(int i = largest + 1; i <= root; i++){
			if (number % i == 0) {
				number = number / i;
				//change root to reduce computation time
				root = (int) Math.sqrt(number) + 1;
				largest = i;
			}
		}
		System.out.println(number);
		//check to see if remaining factor is higher than the largest prime
		if(number > largest) largest = (int) number;
		System.out.println("The Largest Prime is: " + largest);
	}
}
