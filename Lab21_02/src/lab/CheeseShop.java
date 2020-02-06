package lab;

import java.util.Scanner;

public class CheeseShop {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double weHF, weRH, weTel; 				// we = weight
		int amHF = 0, amRH = 0, amTel = 0;		// am = amount of packages
		double totalHF, totalRH, totalTel;
		double disHF = 0, disRH = 0;			// dis = discount
		double subTotal, finalTotal;
		boolean discountRH = false, discountHF = false;

		System.out.println("We sell 3 kinds of Cheese (in 0.5 lb packages): \n"
				+ "Humboldt Fog: $25.0 per pound \n"
				+ "Red Hawk: $40.5 per pound \n"
				+ "Teleme: $17.25 per pound \n");

		System.out.print("Enter the amount of Humboldt Fog in lbs: ");
		weHF = input.nextDouble();
		weHF = weight(weHF);
		amHF = (int) (weHF / 0.5);

		System.out.print("Enter the amount of Red Hawk in lbs: ");
		weRH = input.nextDouble();
		weRH = weight(weRH);
		amRH = (int) (weRH / 0.5);

		System.out.print("Enter the amount of Teleme in lbs: ");
		weTel = input.nextDouble();
		weTel = weight(weTel);
		amTel = (int) (weTel / 0.5);

		// find totals
		totalHF = (25.0 / 2) * amHF;
		totalRH = (40.5 / 2) * amRH;
		totalTel = (17.25 / 2) * amTel;
		subTotal = totalHF + totalRH + totalTel;

		System.out.println("");

		//list
		System.out.print("Display the itemized list? (1 for yes) ");
		if(input.nextInt() == 1) {
			if((weHF + weRH + weTel) == 0) {
				System.out.println("No items were purchased.");
			} else {
				if(weHF > 0) {
				System.out.println(weHF + " lb of Humboldt Fog @ $25.0 = $" + totalHF);
				} if(weRH > 0) {
				System.out.println(weRH + " lb of Red Hawk @ $40.5 = $" + totalRH);
				} if(weTel > 0) {
				System.out.println(weTel + " lb of Teleme @ $17.25 = $" + totalTel);
				}
			}
		}

		// discounts
		if(amHF >= 2) {
			disHF = (25.5 / 2) * (amHF / 2);
			discountHF = true;
		}
		if(amRH >= 3) {
			disRH = (40.5 / 2) * (amRH / 3);
			discountRH = true;
		}

		finalTotal = subTotal - disHF - disRH;

		// printing totals & discounts3
		System.out.println("");
		System.out.println("Sub Total: \t\t\t  $" + subTotal);
		System.out.println("Discounts... \t\t\t");

		if(!discountHF && !discountRH) {
			System.out.println("None \t\t\t\t -$0.0");
		} else {
			if(discountHF) {
				System.out.println("Humboldt Fog (Buy 1 Get 1 Free): -$" + disHF);
			}
			if(discountRH) {
				System.out.println("Red Hawk (Buy 2 Get 1 Free):\t -$" + disRH);
			}
		}

		System.out.println("Final Total:\t\t\t  $" + finalTotal);
	}

	public static double weight(double weight) {
		while(weight < 0 || ((weight % 0.5) != 0 )) {
			if (weight < 0) {
				System.out.print("Invalid Input. Enter a value >= 0: ");
				weight = input.nextDouble();
			} else if((weight % 0.5) != 0 ) {
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				weight = input.nextDouble();
			}
		}
		return weight;
	}

}

