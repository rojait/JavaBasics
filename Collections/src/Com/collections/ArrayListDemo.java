package Com.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<>();
		stringlist.add("Rama");
		stringlist.add("sita");
		stringlist.add("Laxman");
		
		System.out.println("Display using syso out: ");
		System.out.println("   Array list: " + stringlist);
		System.out.println();

		System.out.println("Display using for loop: ");
		for(int i=0; i<stringlist.size();i++){
			System.out.println("   String: " + stringlist.get(i));
		}
		System.out.println();

		System.out.println("Display using for each loop: - read only ");
		for(String data: stringlist){
			System.out.println("  String : "+ data);
		}
		System.out.println();

		System.out.println("Dispaly using iterator:  : ");
		Iterator<String> iterator= stringlist.iterator();
		while(iterator.hasNext()){
			System.out.println("  String: " + iterator.next());
		}
        System.out.println();
        
        System.out.println("Dispaly using iterator forward direction : ");
        ListIterator<String> iteratorlist= stringlist.listIterator();
		while(iteratorlist.hasNext()){
			System.out.println("  String : " + iteratorlist.next());
		}
        System.out.println();
        System.out.println("Dispaly using iterator backword direction : ");
		while(iteratorlist.hasPrevious()){
			System.out.println("   String : " + iteratorlist.previous());
		}
        System.out.println();
        
				System.out.println("Display using for each method reference : ");
		stringlist.forEach(System.out::println);
		System.out.println();
		
		//This is called functional based programming 
		//Line 52 is a method  , not for loop, will apply to each and every node 
		//only writing one line we can get the same result 

	}
}

/* output:- 
 *   Display using syso out: 
   Array list: [Rama, sita, Laxman]

Dispaly using for loop: 
   String: Rama
   String: sita
   String: Laxman

Display using for each loop: - read only 
  String : Rama
  String : sita
  String : Laxman

Dispaly using iterator:  : 
  String: Rama
  String: sita
  String: Laxman

Dispaly using iterator forward direction : 
  String : Rama
  String : sita
  String : Laxman

Dispaly using iterator backword direction : 
   String : Laxman
   String : sita
   String : Rama

Display using for each method reference : 
Rama
sita
Laxman


*/
