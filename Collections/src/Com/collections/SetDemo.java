package Com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();// order in hashing mechanism
		hashset.add("A");
		hashset.add("C");
		hashset.add("D");
		hashset.add("B");

		Set<String> linkedhashset = new LinkedHashSet<>();// User insertion order
		linkedhashset.add("A");
		linkedhashset.add("C");
		linkedhashset.add("D");
		linkedhashset.add("B");

		Set<String> treeset = new TreeSet<>();// sorted order
		treeset.add("A");
		treeset.add("C");
		treeset.add("D");
		treeset.add("B");

		System.out.println("Hashset: - ");
		System.out.println(hashset);

		System.out.println("LinkedHAshSet: - ");
		System.out.println(linkedhashset);

		System.out.println("TreeSet: - ");
		System.out.println(treeset);

	}

}

/*
 * output
 * 
 * Hashset: - [A, B, C, D] 
 * LinkedHAshSet: - [A, C, D, B] 
 * TreeSet: - [A, B, C, D]
 */