package day29_collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap01 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		   //put(Key k, Value v) inserts key value mapping into the map
		   hashMap.put(100, "Mark");    // {100 = Mark}
		   hashMap.put(101, "Angie");  // {100 = Mark, 101 = Angie}
		   hashMap.put(102, "Banu");  // {100 = Mark, 101 = Angie, 102 = Banu}
	       System.out.println(hashMap);  // {100 = Mark, 101 = Angie, 102 = Banu}
	    
	       // remove(Object key) removes the key-value pair for the specified key
	       hashMap.remove(101);
	       System.out.println("After using remove(): " + hashMap);
	       
	       //get(Object key) returns the value for the specified key.
	       System.out.println(hashMap.get(102)); // Banu
	       
	       //containsKey(Object key): It is a boolean function which returns true or false 
	       //based on whether the specified key is found in the map.
	       System.out.println(hashMap.containsKey(100)); // true
	       System.out.println(hashMap.containsKey(101)); // false
	       
	       //isEmpty() is a boolean function which returns true or false 
	       //It checks whether the map is empty. 
	       System.out.println(hashMap.isEmpty()); // false
	       
	       //keySet()returns the Set of the keys fetched from the map.
	       System.out.println(hashMap.keySet()); //[100, 102]
	       
	       //values()returns a collection of values of map.
	       System.out.println(hashMap.values()); //[Mark, Banu]
	       
	       //size() Returns the size of the map
	       System.out.println(hashMap.size());// 2
	       
	       // clear() removes all the key and value pairs from the specified Map.
	       hashMap.clear();
	       System.out.println(hashMap); //{}
	}
}
