/*
 * Problem 7
 * 10,001st Prime
 * By listing the first six prime numbers:
 *  2, 3, 5, 7, 11, and 13, 
 *  we can see that the 6th prime is 13.
 *  What is the 10 001st prime number?
 *  
 *  Luke Young
 *  May 16th, 2017
 */
public class Problem7 {
	public static int lastPrime, numPrime;

	public static void main(String[] args) {
		// only test up to the square root
		numPrime = 2;
		lastPrime = 5;
		countPrimes();
		System.out.println("The " + numPrime + "st prime is " + lastPrime);

	}
	
	public static void countPrimes(){
		for(int i = 5; numPrime <= 10000; i++){
			if(isPrime(i) == true){
				numPrime++;
				lastPrime = i;
			} else;
		}
	}

	public static boolean isPrime(int num) {
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}
