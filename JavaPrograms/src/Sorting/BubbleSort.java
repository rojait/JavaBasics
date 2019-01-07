package Sorting;

//Is one of the sorting algorithm to sort arrays 
//In bubble sort algorithm, array is traversed from first element to last element. 
//Here, current element is compared with the next element. 
//If current element is greater than the next element, it is swapped.

public class BubbleSort {
	
	//3. create a method to sort the array 
	static void bubbleSort(int[] arry){
		
		int temp=0;
		
		//create for loop, this loop will run till the length of the array 
		for(int i=0; i<=arry.length; i++)
			//arry[i]=temp;
			
			for(int j=1;j<(arry.length-1); j++){
				{
				//System.out.println("the J is " + j);
				if(arry[j-1]> arry[j])
				//System.out.println("the after is " + j);  
				{
					//swap the elements 
					temp = arry[j-1];
					//System.out.println("The value of temp " + temp);
                    arry[j-1] = arry[j];  
                    //System.out.println("Now the value of j =  "+ j);
                    arry[j] = temp; 
                    //System.out.println("The value after temp is :- " + temp);
                    //System.out.println("---------------------");
					
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		//1. Creating an array 
		int array[]={3,60,35,2,45,320};
		
		//2. print the array before sorting 
		System.out.println("Before sorting the array:-  ");
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]+" ");
	
		}
		
		System.out.println();
		
		//sorting array elements using bubble sort
		bubbleSort(array);
		
		System.out.println("After sorting the array:-  ");
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		

	}

}

/*output:-
 * Before sorting the array:-  
3 60 35 2 45 320 
After sorting the array:-  
2 3 35 45 60 320 
*/
