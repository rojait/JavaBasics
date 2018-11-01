package BasicString.programs;

import java.util.Scanner;

public class InsertSpaceWithPercentile20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Enter the String : ");
		s1 = input.nextLine();
		System.out.println("Input: " + s1);
		//System.out.println("Output: " + InsertPercentile.ReplaceSpaces1(s1));
		System.out.println("Output: " + InsertSpaceWithPercentile20.ReplaceSpaces2(s1));

		input.close();
	}

	/*
	 * public static String ReplaceSpaces1(String sentence1) { return
	 * sentence1.replace(" ", "%20"); }
	 */

	public static String ReplaceSpaces2(String sentence1) {
		String[] words = sentence1.split(" ");
		StringBuilder sentence2 = new StringBuilder(words[0]);

		for (int i = 1; i < words.length; ++i) {
			sentence2.append("%20");
			sentence2.append(words[i]);
		}
		return sentence2.toString();
	}

}
/*Enter the String : 
Java is a Programming Language
Input: Java is a Programming Language
Output: Java%20is%20a%20Programming%20Language
*/