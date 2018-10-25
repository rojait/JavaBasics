package BasicPrograms;

//Q. WAP to a specified number of Fibonacci series with recursion(Creating a method) 
//0,1,1,2,3,5,8,13,21,34.........
//The next number is the sum of previous two numbers. 

public class FibonacciWithRecursion {

	// 1. Create 3 variables
	static int first = 0, second = 1, third = 0;

	// System.out.print(first + " , " + second);

	// 2. create a method
	static void fibonacciSeries(int count) {
		if (count > 0) {
			third = first + second;
			first = second;
			second = third;
			System.out.print(", " + third);
			fibonacciSeries(count - 1);
		}
	}

	public static void main(String[] args) {

		int count = 10;
		System.out.print(first + ", " + second);// printing 0 and 1
		fibonacciSeries(count - 2);// n-2 because 2 numbers are already printed

	}

}

/*
 * output:-
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */
