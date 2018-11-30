package Com.collections;

import java.util.LinkedList;

/*Q. Program to implement a LinkList--------------------------------------
 1. Create object of class linked list 
 2. Add elements to the linked list (.add, addlast, .addfirst)
 3. Remove elements from the linked list (.remove, .removefirst, .removeLast();
 4. Find elements in the linked list- boolean status = object.contains("E");
 5. Number of  elements in the linked list --int size = object.size();
 6. get and set elements in linked list --Object element = object.get(2);  object.set(2, "Y"); */

public class LinkedListDemo {

	public static void main(String[] args) {
		
		// create an object of class linked list
		LinkedList<String> list = new LinkedList<String>();

		// adding elements to linked list
		list.add("A");
		list.add("C");
		list.add("B");
		list.addLast("X");
		list.addFirst("1");
		System.out.println(list);

		// Removing from list
		list.remove("B");
		list.removeLast();
		list.removeFirst();
		System.out.println(list);

		// find elements in linked list
		boolean status = list.contains("C");
		if (status)
			System.out.println("list contains elements");
		else
			System.out.println("does not contain elements");

		// number of elements of linked list
		int size = list.size();
		System.out.println(size);

		// get and set elements from linked list
		String element = list.get(1);
		System.out.println(element);
		list.set(2, "N");

		System.out.println(list);

	}

}
