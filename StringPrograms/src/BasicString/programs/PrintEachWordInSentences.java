package BasicString.programs;

import java.util.Scanner;

public class PrintEachWordInSentences {

	public static void main(String[] args) {

		//Asking user to enter sentence
		Scanner input = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Enter the String : ");
		s1 = input.nextLine();
		System.out.println("Input: " + s1);
		System.out.println(PrintEachWordInSentences.eachWord(s1));
		input.close();

	}

	public static String eachWord(String sentence) {
		
		// creating an array with the words separated by space
		String[] words = sentence.split(" ");
		
		// for loop to print all the words in the sentence
		for (int i = 0; i <= words.length - 1; i++) { 
			System.out.println(words[i]);

		}
		return sentence;
	}
}

/*Enter the String : 
Input:- java is a Programming Language 
java
is
a
Programming
Language
java is a Programming language 
*/
