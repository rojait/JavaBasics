package Com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> contactlist =new HashMap<>();
		//order of hashing mechanism
		//Hashing mechanism applicable to key only 
		
		contactlist.put("name1", 1234);
		contactlist.put("name2", 1235);
		contactlist.put("name3", 1236);
		contactlist.put("name4", 1237);
		contactlist.put("name5", 1238);
		contactlist.put("name3", 2349);//name 3 is already there , so it will replace the value
		System.out.println("Contact list : "+ contactlist);
		System.out.println("get number for name3 : "+ contactlist.get("name3"));
		
		for(Map.Entry entryset: contactlist.entrySet()){
			System.out.println(entryset.getKey()+ " "+  entryset.getValue());//display the key and value
		}
		System.out.println("------------------");
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		System.out.println("------------------------");
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();  
		  tm.put(100,"Amit");  
		  tm.put(102,"Ravi");  
		  tm.put(101,"Vijay");  
		  tm.put(103,"Rahul");  
		  for(Map.Entry m:tm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
	}

}

/* output
 * Contact list : {name5=1238, name4=1237, name3=2349, name2=1235, name1=1234}
get number for name3 : 2349
name5 1238
name4 1237
name3 2349
name2 1235
name1 1234
------------------
100 Amit
101 Vijay
102 Rahul
------------------------
100 Amit
101 Vijay
102 Ravi
103 Rahul

*/
