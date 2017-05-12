/* Problem 4
 * Largest palindrome product
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Luke Young
 * May 12, 2017
 */
public class Problem4 {
	public static String number;
	public static int biggest, num1, num2;

	public static void main(String[] args) {
		//largest number made from 2 3-digit numbers is:
		//999 * 999 = 998001
		
		System.out.println(991*998);
		
		//start from 999*999 and go down?
		findBig();
		System.out.println(biggest+ " is the biggest palindrome as a product of "
		+ num1 + "*" +num2);
		
		//number = "1234554321";
		
		
		//System.out.println(number.length());
		//System.out.println("The number is a Palindrome: " + isPalin());
		

	}
	
	public static void findBig(){
		biggest = 0;
		num1 = 0;
		num2 = 0;
		//super inefficient code incoming
		for(int i = 999; i > 99; i--){
			for(int j = i; j > 99; j--){
				number = Integer.toString(i * j);
				if(isPalin()){
					if(Integer.parseInt(number) > biggest){
						biggest = Integer.parseInt(number);
						num1 = i;
						num2 = j;
					}
				}
			}
		}
	}
	
	public static boolean isPalin(){
		short[] pally = new short[number.length()];
		int newNum = Integer.parseInt(number);
		for(int i = 0; i < number.length(); i++){
			pally[i] = (short) (newNum % 10);
			newNum = newNum/10;
			//System.out.println(newNum);
			//System.out.println(pally[i]);
		}
		for(int i = 0; i < pally.length/2; i++){
			if(pally[i] == (pally[pally.length - (i + 1)])){
			} else return false;
		}
		return true;
	}

}
