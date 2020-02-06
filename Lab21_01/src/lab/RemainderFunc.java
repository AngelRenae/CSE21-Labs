 package lab;

import java.util.Scanner;

public class RemainderFunc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maxNum, divisor;
		boolean nums = false;
		
		System.out.print("Please enter the max number: ");
		maxNum = input.nextInt();
		while(maxNum < 0) {
			System.out.print("Invalid input. Please enter a valid max number (>= 0): ");
			maxNum = input.nextInt();
		}
		
		System.out.print("Please enter the divisor: ");
		divisor = input.nextInt();
		while(divisor <= 0) {
			System.out.print("Invalid input. Please enter a valid divisor (> 0): ");
			divisor = input.nextInt();
		}
		
		
		System.out.println("");
		System.out.println("Multiples of 2 between 1 and " + maxNum + " (inclusive) are:");
		for(int i = 1; i < maxNum; i++) {
			if((i % divisor) == 0) {						// if the divisor evenly goes into i
				System.out.println((i / divisor) * divisor);// the amount of times the divisor goes into i * the divisor = factor
				nums = true; // values were printed
			}
		}
		
		// check if any numbers were printed
		if(!nums) {
			System.out.println("No number were found.");
		}
		
		input.close();
	}	

}
