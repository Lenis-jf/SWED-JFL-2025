package exercise1;

public class Ulam_function {
	private static final int MILLION = 1000000;
	
	public static int ulam(int number) {
		if(number <= 0 || number >= MILLION) {
			System.out.println("Error: The input must be grater than 0 and less than 1M");
			return -1;
		}
		
		System.out.println("Input: " + number);
		
		if(number == 1) {
			System.out.println("Output: " + number);
			return 1;
		}
		
		if(number % 2 == 0) {
			System.out.println("Output: " + number + "\n");
			
			return 1 + ulam(number / 2);
		} else {
			System.out.println("Output: " + number + "\n");
			
			return 1 + ulam(number * 3 + 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ulam sequence for n = 10 -------------------------------------------------------\n");
		ulam(10);
		
		System.out.println("\nUlam sequence for n = 100 ------------------------------------------------------\n");
		ulam(100);
	}
}

