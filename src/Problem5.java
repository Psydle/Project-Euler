/*
 * Problem 5
 * Smallest Multiple
 * 2520 is the smallest number that can be divided by each
 *  of the numbers from 1 to 10 without any remainder.
 *  What is the smallest positive number that is evenly 
 *  divisible by all of the numbers from 1 to 20?
 *  
 *  Luke Young
 *  May 12, 2017
 */
public class Problem5 {
	public static long smallest;

	public static void main(String[] args) {
		/*
		 * Well it would have to at least include all of the primes
		 * It would not include any numbers less than 21 that can go into
		 * another number less than 21 (i.e. 2 goes into 4 goes into 8)
		 * so it would include:
		 * 20, (uses 2, 2, 5) (x's 4, 10, 2, 5)
		 * 19
		 * 18 (uses 2, 3, 3) (x's 8, 6, 3, 15, 9)
		 * 17
		 * 2 (x's 16)
		 * 7 (x's 14)
		 * 13
		 * 11
		 * So just multiply those
		 */
		//smallest = (5*2*3*3*4*7);
		smallest = (20*19*18*17*2*7*13*11);
		
		System.out.println("The Smallest Multiple that is divisible by "
				+ " the numbers 1 to 20 is: " + smallest);

	}

}
