package BasicString.programs;

import java.util.Arrays;

//duplicate or unique characters
public class CountDuplicateCharacters {
	public static void main(String[] args) {
		String string = "javatimet ";
		string = string.toLowerCase();
		System.out.println("Input is :-  " + string);

		char[] charAr = string.toCharArray();

		Arrays.sort(charAr);// sorted in alphabetic order
		System.out.println("After sorting in alphabatic order:-  ");
		System.out.println(charAr);

		for (int i = 1; i < charAr.length;) {
			int count = recursiveMethod(charAr, i, 1);
			if (count > 1) {
				System.out.println("'" + charAr[i] + "' comes " + count
						+ " times");
				i = i + count;
			} else
				i++;

		}
	}

	public static int recursiveMethod(char[] charAr, int i, int count) {
		if (ifEquals(charAr[i - 1], charAr[i])) {
			count = count + recursiveMethod(charAr, ++i, count);
		}
		return count;
	}

	public static boolean ifEquals(char a, char b) {
		return a == b;
	}

}

/*
 * Input is :-  javatimet 
After sorting in alphabatic order:-  
 aaeijmttv
'a' comes 2 times
't' comes 2 times
 */
