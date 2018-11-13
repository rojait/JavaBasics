package ArrayPrograms;

// https://www.youtube.com/watch?v=g6oJHcDQONg
//https://www.geeksforgeeks.org/find-the-index-of-an-array-element-in-java/
//https://www.javatpoint.com/java-program-to-remove-duplicate-element-in-an-array

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInAnArrays {

	public static void main(String[] args) {
		int[] array= { 22, 33, 44, 22, 55, 44};
		
        sorting(array);
	}
	
	//creating a method
	public static void sorting(int [] arr){
		//create a list of integers
		List <Integer> list= new ArrayList<Integer>();
		
		//creating a loop 
		for(int i :arr){
			//we added the value to the list
			list.add(i);
		}
		
		//creating a set of integers
		//set cannot accept duplicate value 
		Set<Integer> set= new LinkedHashSet<Integer>(list);
		for(Integer integer:set){
		    //to find out what we have at last
			System.out.print( + integer + " ");
		}
	}
}
