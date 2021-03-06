package day29_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Try {

	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<String>();
		 list.add("K");
		 list.add("L");   
		 list.add("M");
		 System.out.println(list); // Output 1
		 
		 ListIterator<String> litr = list.listIterator();
		 while(litr.hasNext()) {
			 Object element = litr.next();
			 litr.set(element + "N");
		 }
		 System.out.println(litr.previous());// Output 2
		 
		 System.out.println(list); // Output 3
	}
}


