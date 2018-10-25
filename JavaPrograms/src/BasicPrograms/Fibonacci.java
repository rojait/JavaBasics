package BasicPrograms;

import java.util.Scanner;

//Q. WAP to a specified number of Fibonacci series 
//0,1, 1,2,3,5,8,13,21,34.........
//The next number is the sum of previous two numbers. 

public class Fibonacci {

	public static void main(String[] args) {
		// 1. create two variables
		int first = 0, second = 1, next;

		// 2. create variable of how many numbers you want
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci series: ");
		int numbers = input.nextInt();

		// 3. Print first and second number
		System.out.print(first + " , " + second);

		// 4. create for loop to iterate
		for (int count = 0; count <= numbers; count++) {
			next = first + second;
			System.out.print(" ," + next);
			// System.out.println();
			first = second;
			second = next;
			// System.out.println("Numbers: " + first + " , " + second);
		}
		input.close();
	}

}
/*
 * output:-
 * Enter the number of fibonacci series: 10
 * 0 , 1 ,1 ,2 ,3 ,5 ,8 ,13 ,21 ,34 ,55 ,89 ,144
 * 
 */
