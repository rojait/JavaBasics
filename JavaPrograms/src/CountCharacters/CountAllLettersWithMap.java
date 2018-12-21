package CountCharacters;

import java.util.HashMap;
import java.util.Map;

public class CountAllLettersWithMap {

	public static void main(String[] args) {

		String s = "abcdabcxyz";

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++)

		{
			char c = s.charAt(i);
			if (!m.containsKey(c))
			{
				m.put(s.charAt(i), 1);
			}
			else
			{
				m.put(s.charAt(i), m.get(c) + 1);
			}
		}
		System.out.println(m);
	}

}
/*
Output:-{a=2, b=2, c=2, d=1, x=1, y=1, z=1}
*/


