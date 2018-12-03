package Com.collections;

import java.util.Hashtable;
import java.util.Map;
//https://www.geeksforgeeks.org/hashtable-in-java/
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		  
		  ht.put(100,"Amit");  
		  ht.put(102,"Ravi");  
		  ht.put(105,"Vijay");  
		  ht.put(103,"Rahul");  
		  
		  for(Map.Entry m:ht.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}

/*
output:-
105 Vijay
103 Rahul
102 Ravi
100 Amit
*/