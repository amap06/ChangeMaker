package maker;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {

		double centsGiven;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter amount of change: ");
		
		centsGiven = scanner.nextDouble();
		centsGiven = getQuarters(centsGiven);
		centsGiven = getDimes(centsGiven);
		centsGiven = getNickels(centsGiven);
		centsGiven = getPennies(centsGiven);
		
		scanner.close();
	}

	public static double getQuarters(double centsGiven) {
		double change = centsGiven % 25;
		double quarters = (centsGiven - change)/25;
		System.out.println((int)quarters + "quarters");
		return change;
}
	public static double getDimes(double centsGiven) {
		double change = centsGiven % 10;
		double dimes = (centsGiven - change)/10;
		System.out.println((int)dimes + "dimes");
		return change;
}
	public static double getNickels(double centsGiven) {
		double change = centsGiven % 5;
		double nickels = (centsGiven - change)/5;
		System.out.println((int)nickels + "nickels");
		return change;
}
	public static double getPennies(double centsGiven) {
		double change = centsGiven % 1;
		double pennies = (centsGiven - change)/1;
		System.out.println((int)pennies + "pennies");
		return change;
	}
}