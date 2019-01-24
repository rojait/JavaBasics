package Sorting;

//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
// we repeatedly compare it with elements to its left, going right to left.
public class InsertionSort {
	
	static void insertionSort(int[] arry){
	 
		int temp;
        for (int i = 1; i < arry.length; i++) {
        	//System.out.println("the i is = "+ i);
        	
            for(int j = i ; j > 0 ; j--){
            	//System.out.println("the j is " +j );
                if(arry[j] < arry[j-1]){
                    temp = arry[j];
                    //System.out.println("The temp is " +temp);
                    arry[j] = arry[j-1];
                    //System.out.println("The j after is " +j );
                    arry[j-1] = temp;
                    //System.out.println("The value after temp is "+ temp);
                   // System.out.println("-------------------------");
                }
            }
        }
	}

	public static void main(String[] args) {
		//1. Creating an array 
				int array[]={3,60,35,2,45,320};
				
				//2. print the array before sorting 
				System.out.println("Before Insertion sort the array:-  ");
				for(int i=0; i<array.length;i++){
					System.out.print(array[i]+" ");
			
				}
				
				System.out.println();
				
				//sorting array elements using bubble sort
				insertionSort(array);
				
				System.out.println("After Insertion sort the array:-  ");
				for(int i=0; i<array.length;i++){
					System.out.print(array[i]+" ");
				}
				

			}

	}

/*output
 * Before Insertion sort the array:-  
3 60 35 2 45 320 
After Insertion sort the array:-  
2 3 35 45 60 320 
*/
