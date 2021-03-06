package day29_collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable02 {

	public static void main(String[] args) {

		   // Creating a HashTable
		   Hashtable<String, String> hashTable = new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to HashTable
		   hashTable.put("Key1","Chaitanya");
		   hashTable.put("Key2","Ajeet");
		   hashTable.put("Key3","Peter");
		   hashTable.put("Key4","Ricky");
		 
		   // What is Enumeration?
		   // Enumeration is an interface and found in the java.util package.
		   // The main difference between Iterator and Enumeration is removal of the element while traversing the collection. 
		   // Iterator can remove the element during traversal of collection as it has remove() method. 
		   // Enumeration does not have remove() method.
		   // As you know; Iterator has hasNext(), next(), remove() methods.
		   // Enumeration has hasMoreElements() and nextElement() methods, Enumeration does not have remove() method.
		   
		   Enumeration names = hashTable.keys(); 
	       while (names.hasMoreElements()) {
	          String key = (String) names.nextElement();
	          System.out.println("Key: "+ key + " & Value: " + hashTable.get(key)); 
	       } 
	}
}


