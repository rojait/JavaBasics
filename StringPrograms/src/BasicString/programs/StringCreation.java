package BasicString.programs;

public class StringCreation {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		// different memory location

		String s3 = "Hello";
		String s4 = "Hello";
		// same memory location

		if (s1 == s2) {
			System.out.println("s1 == s2------> True");
		} else {
			System.out.println("s1 == s2------>False");
		}

		if (s3 == s4) {
			System.out.println("s3 == s4 ----->True");
		} else {
			System.out.println("s3 == s4 -----> False");
		}

		if (s1 == s3) {
			System.out.println("s1 == s3------>True");
		} else {
			System.out.println("s1 == s3------>False");
		}

		if (s2 == s4) {
			System.out.println("s2 == s4-------->True");
		} else {
			System.out.println("s2 == s4-------->False");
		}

		System.out.println("-------------------");
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2)------> True");
		} else {
			System.out.println("s1.equals(s2)------>False");
		}

		if (s3.equals(s4)) {
			System.out.println("s3.equals(s4) ----->True");
		} else {
			System.out.println("s3.equals(s4) -----> False");
		}

		if (s1.equals(s3)) {
			System.out.println("s1.equals(s3)------>True");
		} else {
			System.out.println("s1.equals(s3)------>False");
		}

		if (s2.equals(s4)) {
			System.out.println("s2.equals(s4)-------->True");
		} else {
			System.out.println("s2.equals(s4)-------->False");
		}

	}

}
