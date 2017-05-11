import java.util.Scanner;

public class Problem1 { //trying without optimizing
	static int problemSize;
	static int sum;

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input Top number to calculate sum:");
		problemSize = input.nextInt();
		System.out.println("You entered: " + problemSize);
		
		//call calculation
		sum = 0;
		sum = findSum(problemSize);
		
		// return sum
		System.out.println("The sum of all integers from 1-" + problemSize 
				+ " that are divisible by 3 or 5 is: " + sum);
	}
	 public static int findSum(int count){
		 for(int i = 1; i < count; i++){
			 if(i%3 == 0 | i%5 == 0){ //if divisible by 3 or 5
				 sum = sum + i;
			 }
		 }
		 return sum;
	 }

}
