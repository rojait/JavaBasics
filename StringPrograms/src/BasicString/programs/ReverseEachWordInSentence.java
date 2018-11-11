package BasicString.programs;

import java.util.Scanner;

public class ReverseEachWordInSentence {

	public void ReverseSen(String sentence) {
		String Reverse = "";
		String words[] = sentence.split(" ");// words in the sentence are stored
												// in an array
		for (String s : words) { // assigning each work to s
			int i = s.length();// each word length
			String s1 = "";
			while (i > 0) { // run till i is grater than 0, i.e till all the
							// words
				char ch = s.charAt(i - 1); // char is a single character
				s1 = s1 + ch;
				i--;
			}
			Reverse = Reverse + s1 + " ";
		}
		System.out.println(Reverse);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Enter the String : ");
		s1 = input.nextLine();
		System.out.println("Input: " + s1);

		ReverseEachWordInSentence object = new ReverseEachWordInSentence();
		System.out.println("OutPut :");
		object.ReverseSen(s1);

		input.close();
	}
}

/*
 * Enter the String : java is a Programming language 
 * Input: java is a Programming language 
 * OutPut : avaj si a gnimmargorP egaugnal
 */

