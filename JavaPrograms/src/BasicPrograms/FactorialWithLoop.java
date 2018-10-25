package BasicPrograms;

//Factorial of n is the product of all positive descending integers.
//4! = 4*3*2*1 = 24 
//Factorial is normally used in Permutations and combinations. 

public class FactorialWithLoop {

	public static void main(String[] args) {
		int fact = 1;
		int number = 5; // It is the number to calculate Factorial

		// Creating for loop
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is = " + fact);

	}

}

/*
 * output:-
 * Factorial of 5 is = 120
 */
