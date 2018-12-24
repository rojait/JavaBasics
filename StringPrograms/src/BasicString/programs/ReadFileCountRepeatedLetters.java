package BasicString.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Q. WAP to read contents of text file and count how many times letter “a” is available in text file 
public class ReadFileCountRepeatedLetters {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("textfile");// File is a class 
		Scanner input = new Scanner(file);

		String word = null;
		int count = 0;
		while (input.hasNextLine()) {
			word = input.nextLine();
			for (int i = 0; i < word.length(); i++) {
				if (word.substring(i, i + 1).equals("a")) {//apple
					count++;
				}
			}
		}
		System.out.println("Number of repeated letters : " + count);
		input.close();
	}

}
/*
output:-
Number of repeated letters : 15
*/
