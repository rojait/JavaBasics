package BasicPrograms;

public class SwapBetweenNumbers {

	public static void main(String[] args) {
		// 1.create two variables
		int firstnum = 10;
		int secondnum = 20;

		// 2.print them before swapping
		System.out.println("First number before swapping = " + firstnum);
		System.out.println("Second number before swapping = " + secondnum);

		// 3.changing the value is firstnum
		firstnum = firstnum + secondnum;

		// 4.changing the value of second number
		secondnum = firstnum - secondnum;

		// 5.Again change the value of firstnum
		firstnum = firstnum - secondnum;

		// 6.Printing after swapping the numbers
		System.out.println("First number after swapping = " + firstnum);
		System.out.println("Second number after swapping = " + secondnum);

	}

}

/*
 * Output:- First number before swapping = 10 Second number before swapping = 20
 * First number after swapping = 20 Second number after swapping = 10
 */
