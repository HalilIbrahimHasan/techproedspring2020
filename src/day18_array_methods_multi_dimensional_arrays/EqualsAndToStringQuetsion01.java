package day18_array_methods_multi_dimensional_arrays;

import java.util.Arrays;

public class EqualsAndToStringQuetsion01 {

	public static void main(String[] args) {
		/*
		 * Create two arrays which have same elements in different order.
		 * Use equals() to compare them before using sort() and after using sort()
		 * Print the elements of the arrays on the console by using toString()
		 */
		
		String str1[] = {"A", "C", "B"};
		String str2[] = {"A", "B", "C"};
		
		System.out.println(Arrays.equals(str1, str2));
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		System.out.println(Arrays.equals(str1, str2));
		
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
	}
}
