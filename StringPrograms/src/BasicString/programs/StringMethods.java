package BasicString.programs;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner inputm = new Scanner(System.in);
		String s1 = new String(" ");
		System.out.println("Enter the String: ");
		s1 = inputm.nextLine();
		System.out.println("Input String: " + s1);

		// 1. Returns the characters located in the string
		System.out.println("Charter located at the string: " + s1.charAt(4));

		// 2. Length of the string
		System.out.println("Length of the string : " + s1.length());

		// 3. Concatenating two strings
		System.out.println("Concatinating two strings: "
				+ s1.concat(" Language "));

		// 4. String replacing all old with new characters
		System.out.println("Replacing old with new character: "
				+ s1.replace("Java", "Python"));

		// 5. Return a part of the substring
		System.out.println("Returns part of sub String : " + s1.substring(5));
		System.out.println("Returns Part of substring: " + s1.substring(0, 3));

		// 6. Converting uppercase to lower case.
		System.out.println(("Uppercase to Lower case: " + s1.toLowerCase()));

		// 7. Converting to upper case.
		System.out.println("Lowercase to Uppercase: " + s1.toUpperCase());

		// 8. Removing the blank spaces.
		System.out.println(s1 + " Learn");
		System.out.println(s1.trim() + " ");

		// 9. Creating an array of characters fro chracters to string.
		// char[] arrayC = s1.toCharArray();
		System.out.println("Array : " + s1);

		// 10. Return true os target string is contaninig search string provided
		// by argunment.
		String sc = "Java is programing language";
		System.out.println("Checking whether it contains the word: "
				+ sc.contains("Java"));

		// 11. Split method
		System.out.println("Split string : ");
		String array1[] = s1.split(" ");
		for (String temp : array1) {
			System.out.println(temp);
		}

		// Split with string 2
		System.out.println();
		System.out.println("Split string with limit 2 : ");
		String array2[] = s1.split(" ", 2);
		for (String temp : array2) {
			System.out.println(temp);
		}

		// split method with with limit 0
		System.out.println();
		System.out.println("Split string with limit 0 : ");
		String array3[] = s1.split(" ", 0);
		for (String temp : array3) {
			System.out.println(temp);
		}
		inputm.close();
	}

}

/*
 * Enter the String: 
Java is a programming Language 
Input String: Java is a programming Language 
Charter located at the string:  
Length of the string : 31
Concatinating two strings: Java is a programming Language  Language 
Replacing old with new character: Python is a programming Language 
Returns part of sub String : is a programming Language 
Returns Part of substring: Jav
Uppercase to Lower case: java is a programming language 
Lowercase to Uppercase: JAVA IS A PROGRAMMING LANGUAGE 
Java is a programming Language  Learn
Java is a programming Language 
Array : Java is a programming Language 
Checking whether it contains the word: true
Split string : 
Java
is
a
programming
Language

Split string with limit 2 : 
Java
is a programming Language 

Split string with limit 0 : 
Java
is
a
programming
Language

 */
