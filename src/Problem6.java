/*
 * Problem 6
 * Sum square Difference
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the 
 * first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the
 * first one hundred natural numbers and the square of the sum.
 * 
 * Luke Young
 * May 12, 2017
 */
public class Problem6 {
	public static long squaresSum, sumSquared, difference;

	public static void main(String[] args) {
		//there's a formula for the sum of squares
		//there's a formula for the sum of integers
		//I'll be using both
		
		difference = 0;
		squaresSum = 0;
		sumSquared = 0;
		
		squaresSum = ((100*(101)*(201))/6);
		System.out.println(squaresSum);
		
		sumSquared = ((100*(101))/2);
		sumSquared = sumSquared * sumSquared;
		System.out.println(sumSquared);
		
		difference = sumSquared - squaresSum;
		System.out.println(difference);
	}

}
