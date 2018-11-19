package Programs;

import java.util.Scanner;

public class SquareRootNumber {

	public static void main(String[] args) {
		double number, squareRoot;
		Scanner input = new Scanner(System.in);

		System.out.print(" Please Enter any Number : ");
		number = input.nextDouble();

		squareRoot = Math.pow(number, 0.5);

		System.out.println("\n The Square of a Given Number  " + number+ "  =  " + squareRoot);
		input.close();
	}
}

/*
Please Enter any Number : 4

The Square of a Given Number  4.0  =  2.0

*/