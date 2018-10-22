package BasicString.programs;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java ");

		// append
		sb.append("Programming");
		System.out.println(sb);

		// Inserting
		sb.insert(0, "Hello ");
		System.out.println(sb);

		// Replacing
		sb.replace(0, 5, "OOPS ");
		System.out.println(sb);

		// Deleting
		sb.delete(0, 4);
		System.out.println(sb);

		// Reverse
		sb.reverse();
		System.out.println(sb);
		System.out.println();

		// String buffer capacity.
		System.out.println("String buffer capacity Before:-");
		StringBuffer sb3 = new StringBuffer("Hello ");
		System.out.println(sb3.capacity());
		sb3.append("Java is a programming language ");
		;
		System.out.println(sb3);
		System.out.println();
		System.out.println("string buffer capacity After:- ");
		System.out.println(sb3.capacity());
		sb3.append(",OOPS Concepts ");
		System.out.println(sb3);
	}

}
