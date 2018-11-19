package Programs;

import java.util.Scanner;

public class SquareOfANumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to square: ");
		int num = input.nextInt();
		System.out.println(square(num));

		input.close();

	}

	public static int square(int num) {
		System.out.println("You entered: " + num);
		num = num * num;
		System.out.println("Square of the entered number is : " + num);
		return num;

	}
}

/*
Please enter a number to square: 4
You entered: 4
Square of the entered number is : 16
16*/
