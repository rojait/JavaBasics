package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		List<String> arraylist = new ArrayList<>();
		arraylist.add("Name");
		arraylist.add("ID");

		System.out.println(arraylist);

		// Converting arraylist to array
		String[] item = arraylist.toArray(new String[arraylist.size()]);
		for (String s : item) {
			System.out.println(s);

			// converting array to arraylist
			List<String> l2 = new ArrayList<>();
			l2 = Arrays.asList(item);
			System.out.println(l2);
		}
	}

}
