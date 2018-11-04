package BasicPrograms;

//Palindrome number is a number that is same as reverse 
//example- 545, 151, 34543 

import java.util.Scanner;
public class PalindromeNumberString {

	public static void main(String args[]) {

		// 1. create two variables
		String original, reverse = "";// Objects of string class

		// 2. Get the number to check whether the number is palindrome.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome ");
		original = input.nextLine();

		// 3. create a variable to find the length of the string
		int length = original.length();

		// 4. create for loop to reverse the number
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		// 5. checking if the number is palindrome or not
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number is not palindrome.");
		input.close();

	}
}
/*
 * Enter a string/number to check if it is a palindrome 
545
Entered string/number is a palindrome.
*/
