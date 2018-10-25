package BasicPrograms;

public class FactorialWithRecursion {

	// 1. Create a method
	static int factorial(int fact) {
		if (fact == 0)// fact= 4
			return 1;
		else
			return (fact * factorial(fact - 1));
	}

	public static void main(String[] args) {
		int answer;
		int number = 4; // it is the number to calculate factorial

		answer = factorial(4);
		System.out.println("Factorial of " + number + " is = " + answer);

	}

}

/*
 * output:-
 * Factorial of 4 is = 24
 */
