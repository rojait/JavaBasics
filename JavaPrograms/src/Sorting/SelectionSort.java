package Sorting;

//In Sorting Algorithm we search for the lowest element(ascending order) and arrange it in proper place.
//5,-5,16,2
//-5,25,16,2
//-5,2,25, 16

public class SelectionSort {

	static void selectionSort(int[] arry) {
		// run the loop till the array length
		for (int i = 0; i < arry.length - 1; i++) {
			//System.out.println("the i = " + i);

			// find the minimum element in unsorted array
			int length = i;
			for (int j = i + 1; j < arry.length; j++) {
				//System.out.println("The value of j= " + j);
				if (arry[j] < arry[length])
					length = j;
				//System.out.println("the value of j " + j);

				// Swap the found minimum element with the first
				// element
				int temp = arry[length];
				//System.out.println("The value of temp =" + temp);
				arry[length] = arry[i];
				//System.out.println("The value of i " + i);
				arry[i] = temp;
				//System.out.println("The value of temp =" + temp);
				//System.out.println("------------------------------------");
			}

		}
	}

	public static void main(String[] args) {
		// 1. Creating an array
		int array[] = { 64, 25, 12, 22, 11 };

		// 2. print the array before sorting
		System.out.println("Before sorting the array:-  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

		System.out.println();

		// sorting array elements using bubble sort
		selectionSort(array);

		System.out.println("After sorting the array:-  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
