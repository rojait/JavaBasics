package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;
//write a program to find duplicate elements in an array
//https://www.youtube.com/watch?v=P_HKhRmLWL4

public class PrintDuplicateInAnArray {

	public static void main(String[] args) {

		// 1. Create and Instalize input array.
		String duplicates[] = new String[] { "One", "Two", "Three", "Four", "One", "Four" };

		// 2. Create a empty set and name it as non duplicate array.
		Set<Object> nonDuplicatesSet = new HashSet<>();

		// 3. Create a empty set and name it as duplicates set.
		Set<Object> duplicatesSet = new HashSet<>();

		// 4. Iterate through the each element in array and check whether non
		// duplicates contains the elements.
		// if it is present add it to the duplicate set.
		for (String set : duplicates) {
			// 5. If it is not present add it to non duplicate set.
			if (!nonDuplicatesSet.contains(set)) {
				nonDuplicatesSet.add(set);
				//System.out.println(nonDuplicatesSet);
			} else {
				duplicatesSet.add(set);
			}
		}

		// 6. Print the elements in duplicate set.
		System.out.println(duplicatesSet);
	}

}
/*
 * [One, Four]
 */
