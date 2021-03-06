package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda10 {

	public static void main(String[] args) {
		// Print the squares of even numbers on the console by using "Functional" programming
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		//Predicate Functional Interface
		Predicate<Integer> isEvenPredicate = x -> x%2==0; // If a method returns "boolean" and uses just 1 argument
		                                                  // it is implementing "Predicate" functional Interface
		//Function Functional Interface
		Function<Integer, Integer> squareFunction = t->t*t; // If a method returns a value different from boolean 
		                                                    // 1st argument is input, 2nd is output
		                                                    // Function ==> Input exist, output exist
                                                            // It is implementing "Function" functional Interface
		//Consumer Functional Interface
		Consumer<Integer> sysoutConsumer = System.out::println; // If a method returns void
                                                                // it is implementing "Consumer" functional Interface
		                                                        // Consumer==> input exist but no output
		
		list.stream()                                                              
	        .filter(isEvenPredicate)  
	        .map(squareFunction)      
	        .forEach(sysoutConsumer);
		System.out.println("====");
		
		//BinaryOperator Functional Interface
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum; // BinaryOperator represents a function that accepts "2 arguments" and produces "1 result".
		                                                          // Integer::sum and (x, y) -> x+y are same
		int sum =list.stream()
                     .reduce(0,sumBinaryOperator);
		System.out.println("Sum: " + sum);
		
		//Behavior Parameterization
		//Question: Create a filterAndPrint method which works for any filter by using listInt
		        System.out.println("====");
				filterAndPrint(list, x->x%2==0);
				System.out.println("====");
				filterAndPrint(list, x->x%2!=0);
				System.out.println("====");
				filterAndPrint(list, x->x%3==0);
				System.out.println("====");
				filterAndPrint(list, x->x%7==0);           
	}
	
	public static void filterAndPrint(List<Integer> list, Predicate<Integer> predicate) {
		list.stream()
		    .filter(predicate)
		    .forEach(System.out::println);	
	}
	
}
